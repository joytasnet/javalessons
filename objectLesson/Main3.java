import java.util.*;
public class Main3{
	public static void main(String[] args){
		Empty e=new Empty();
		e.name="さぶ";
		System.out.println(e);
		List<Empty> list=new ArrayList<>();
		Empty e2=new Empty();
		e2.name="ヒロ";
		list.add(e);
		list.add(e2);
		System.out.println(list);
		if(e.equals(e2)){
			System.out.println("二つは同じです");
		}else{
			System.out.println("二つは同じではありません。");
		}
		Empty e3=new Empty();
		e3.name="ヒロ";
		if(e2.equals(e3)){
			System.out.println("二つは同じです");
		}else{
			System.out.println("二つは同じではありません。");
		}
	}
}
