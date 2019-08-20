import java.util.*;
import my.util.*;
public class Main2{
	public static void main(String[] args){
		Map<Integer,Integer> map=new LinkedHashMap<>();
		int count=Common.input("サイコロを何回ふりますか>");
		for(int i=0;i<count;i++){
			int num=Common.rand(1,6);
			if(map.containsKey(num)){
				int old=map.get(num);
				map.put(num,old+1);
			}else{
				map.put(num,1);
			}
		}
		Common.print("***result***");
		for(int i=1;i<=6;i++){
			Common.print(i+"...","");
			if(map.containsKey(i)){
				Common.print(map.get(i)+"回");
			}else{
				Common.print("0回");
			}
		}
	}
}
