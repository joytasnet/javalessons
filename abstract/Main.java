public class Main{
	public static void main(String[] args){
		Matango m=new Matango('A');
		Dancer dancer=new Dancer();
		dancer.name="ジェシカ";
		dancer.hp=100;
		dancer.dance();
		dancer.run();
		dancer.attack(m);
		Hero hero=new Hero();
		hero.name="ロト";
		hero.hp=200;
		hero.slip();
		hero.attack(m);
		hero.run();
	}
}
