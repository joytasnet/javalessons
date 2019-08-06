import java.util.*;
public class Main{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<>();
		//要素の追加はaddメソッド
		list.add("John");
		list.add("Paul");
		list.add("George");
		list.add("Ringo");
		//sysoutにlist変数を渡すと一覧してくれる
		System.out.println(list);
		//要素数はsize()メソッド
		System.out.println(list.size());//->4
		//要素取得
		System.out.println(list.get(1));//->Paul
		//for文で回す
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//拡張forで回す
		for(String s:list){
			System.out.println(s);
		}
		//indexを指定して挿入
		list.add(0,"Bob");//->[Bob,John,Paul,George,Ringo]
		//indexを指定して削除
		list.remove(0);//->[John,Paul,George,Ringo]
		//オブジェクトを指定して削除
		list.remove("John");
		list.remove("George");//->[Paul,Ringo]
		//containsメソッドで含まれているかがわかる
		if(list.contains("Paul")){
			System.out.println("含んでいます");
		}
		//要素追加
		list.add("Ono");
		//要素を変更
		list.set(2,"Yoko");//->[Paul,Ringo,Yoko]
		//全要素削除
		list.clear();
		if(list.isEmpty()){
			System.out.println("要素はありません");
		}
		//宣言はListインターフェイス型で行うことが多い
		//ジェネリクス部には参照型しかかけないので注意
		//Integer,Double,Float,Boolean,Character,
		List<Integer> list2=new ArrayList<>();
		list2.add(3);
		list2.add(10);
		System.out.println(list2);//->[3,10]
		//ListのListもできる
		List<List<Integer>> list3=new ArrayList<>();
		List<Integer> l1=new ArrayList<>();
		l1.add(10);l1.add(20);
		list3.add(l1);
		List<Integer> l2=new ArrayList<>();
		l2.add(100);l2.add(200);
		list3.add(l2);
		System.out.println(list3.get(0).get(1));//->20
	}
}
