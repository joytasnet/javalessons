public class Cleric{
	String name;
	int hp;
	int mp;
	static final int MAX_HP=50;
	static final int MAX_MP=10;
	Cleric(String name,int hp,int mp){
		this.name=name;
		this.hp=hp;
		this.mp=mp;
	}
	Cleric(String name,int hp){
		this(name,hp,MAX_MP);
	}
	Cleric(String name){
		this(name,MAX_HP);
	}
	void selfAid(){
		this.mp-=5;
		this.hp=MAX_HP;
	}
	int pray(int sec){
		java.util.Random rand=new java.util.Random();
		int n=rand.nextInt(3);
		n=n+sec;
		if(this.mp+n>MAX_MP){
			n=MAX_MP-this.mp;
		}
		this.mp+=n;
		return n;
	}
}
