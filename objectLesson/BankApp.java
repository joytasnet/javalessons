public class BankApp{
	public static void main(String[] args){
		Bank b1=new Bank();
		b1.accountNumber="1";
		b1.balance=1000;
		System.out.println(b1);
		Bank b2=new Bank();
		b2.accountNumber="2";
		b2.balance=2000;
		System.out.println(b2);
		if(b1.equals(b2)){
			System.out.println("二つの口座は同じです");
		}else{
			System.out.println("二つの口座は違います。");
		}
		Bank b3=new Bank();
		b3.accountNumber=" 1";
		b3.balance=3000;
		System.out.println(b3);
		if(b1.equals(b3)){
			System.out.println("二つの口座は同じです");
		}else{
			System.out.println("二つの口座は違います。");
		}
	
	}
}
