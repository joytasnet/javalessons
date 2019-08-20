public class Main2{
	public static void main(String[] args){
		try{
			String s=null;
			s.length();
		}catch(NullPointerException e){
			System.out.println("NullPointerExcption例外をcatchしました");
			System.out.println("--スタックトレース(ここから)--");
			e.printStackTrace();
			System.out.println("--スタックトレース(ここまで)--");
		}
	}
}
