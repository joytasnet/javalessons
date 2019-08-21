import my.util.*;
public class Main{
	public static void main(String[] args){
		String str="abcdefgh";
		Common.print(str.length());//文字列長->8
		Common.print(str.startsWith("a"));//その文字から始まるか->true
		Common.print(str.endsWith("g"));//その文字で終わるか->false
		Common.print(str.substring(0,3));//部分文字列作成->abc
		Common.print(str.substring(4));//引数一つはそこから後ろ->efgh
		//置換(before,after)->abcde:gh
		Common.print(str.replace("f",":"));
		//指定文字で分割して配列をつくる
		String[] data=str.split("d");
		Common.print(data[0]);//->abc
		Common.print(data[1]);//->efgh
		Common.print(str);//abcdefgh

	}
}
