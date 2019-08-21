import my.util.*;
public class Main2{
	public static void main(String[] args){
		String input=Common.inputStr("数字をカンマ区切りでいれてね>");
		String[] data=input.split(",");
		//String[] data=Common.inputStr("ggggg").split(",");
		int sum=0;
		for(int i=0;i<data.length;i++){
			sum+=Integer.parseInt(data[i]);
		}
		Common.print("和は"+sum);
	}
}
