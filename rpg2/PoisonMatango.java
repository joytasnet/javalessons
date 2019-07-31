public class PoisonMatango extends Matango{
	int poisonCount=5;
	public PoisonMatango(char suffix){
		super(suffix);
	}
	@Override
	public void attack(Hero h){
		super.attack(h);
		if(this.poisonCount>0){
			System.out.println("さらに毒の胞子をばらまいた!");
			int damage=h.getHp()/5;
			h.setHp(h.getHp()-damage);
			System.out.println(damage+"ポイントのダメージ");
			poisonCount--;
	
		}
	}
}
