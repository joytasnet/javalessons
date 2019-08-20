import java.util.*;
import my.util.*;
public class Main4{
	public static void main(String[] args){
		final int MIN=1,MAX=100,COUNT=100;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<COUNT;i++){
			int num=Common.rand(MIN,MAX);
			if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}else{
				map.put(num,1);
			}
		}
		Common.print("***result***");
		Common.print(map.size()+"種類の数値が出ました。");
		for(int key:map.keySet()){
			System.out.printf("%d...%d%n",key,map.get(key));
		}
	}
}
