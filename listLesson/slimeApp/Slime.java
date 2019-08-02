public class Slime{
	private static int totalCount;
	private String name;
	private int hp=20;
	public Slime(){
		totalCount++;	
	}
	public Slime(String name){
		this();
		this.name=name;
	}
	public void appear(){
		System.out.println(this.name+"が現れた!!");
	}
	public void attack(){
		System.out.println(this.name+"の攻撃:5ポイントのダメージを与えた!");
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	public int getHp(){
		return this.hp;
	}
	public static int getTotalCount(){
		return totalCount;
	}
}
