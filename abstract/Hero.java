public class Hero extends Character{
	@Override
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃!");
		m.hp-=5;
		System.out.println("5ポイントのダメージを与えた!");
	}
	public final void slip(){
		this.hp-=5;
		System.out.println(this.name+"は転んだ!");
	}
}
