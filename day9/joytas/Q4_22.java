public class Q4_22{
	public static void main(String[] args){
		int n1=0,n2=1;
		int n3=n1+n2;
		while(n1<=1000){
			System.out.println(n1);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
	}
}
