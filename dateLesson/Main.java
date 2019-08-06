public class Main{
	public static void main(String[] args){
		long start=System.currentTimeMillis();
		System.out.println(start);
		long sum=0L;
		for(int i=0;i<10000000;i++){
			if(i % 3==0 || i % 7==0){
				sum+=i;
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(end);
		System.out.println("答えは"+sum+"かかった時間は"+(end-start)+"ミリ秒");
	}
}
