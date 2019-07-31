public class Hero{
	private String name="ミナト";
	private int hp=100;
	public Hero(){
		System.out.println("Heroクラスのコンストラクタが動作");
	}
	public void attack(Matango m){
		System.out.println(this.getName()+"の攻撃!");
		m.hp-=5;
		System.out.println("5ポイントのダメージを与えた!");
	}
	public final void slip(){
		this.hp-=5;
		System.out.println(this.getName()+"は転んだ!");
	}
	public void run(){
		System.out.println(this.getName()+"は逃げ出した!");
	}
	public String getName(){
		return this.name;
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
}
