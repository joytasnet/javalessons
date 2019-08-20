import java.util.*;
import my.util.*;
public class Main3{
	public static void main(String[] args){
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=1;i<=6;i++){
			map.put(i,0);
		}
		int count=Common.input("サイコロを何回ふりますか>");
		for(int i=0;i<count;i++){
			int num=Common.rand(1,6);
			map.put(num,map.get(num)+1);
		}
		Common.print("***result***");
		for(int key:map.keySet()){
			System.out.printf("%d...%d回%n",key,map.get(key));
		}
	}
}
