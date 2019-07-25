import java.util.Scanner;
public class MethodLesson4{
	static int calcTotalFee(int costExcludeTax,int tax){
		double totalFee=costExcludeTax*(1+tax/100d);
		return (int)totalFee;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int cost=0;
		int price;
		System.out.print("消費税率は何%ですか>");
		int tax=sc.nextInt();
		do{
			System.out.print("価格を入力(0でお会計)>");
			price=sc.nextInt();
			cost+=price;
		}while(price !=0);
		int totalFee=calcTotalFee(cost,tax);
		System.out.printf("お買い物合計金額は%d円(税込み)です。%n",totalFee);
	}
}
