public class PC{
	String maker;
	int price;
	static int totalPc;
	PC(String maker,int price){
		this.maker=maker;
		this.price=price;
		totalPc++;
	}
	void showStatus(){
		System.out.printf("メーカー名:%s,値段:%d%n",this.maker,this.price);
	}
	static void total(){
		System.out.println(totalPc);
	}
}
