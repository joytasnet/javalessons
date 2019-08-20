public class Main3{
	public static void main(String[] args){
		try{
			Integer.parseInt("三");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください!");
		}
	}
}
