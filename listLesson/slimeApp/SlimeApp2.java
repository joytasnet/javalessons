import java.util.*;
import my.util.*;
public class SlimeApp2{
	public static void main(String[] args){
		Common.print("ArrayListを使ってみよう!");
		Common.print("Listにスライムを追加していってみよう。");
		List<Slime> list=new ArrayList<>();
		while(true){
			int select=Common.input("スライムを追加する?(1...yes,2...no):");
			if(select!=1){
				break;
			}
			String name=Common.inputStr("追加するスライムの名前を決めてね:");
			Slime slime=new Slime(name);
			slime.appear();
			list.add(slime);
		}
		for(Slime s:list){
			s.attack();
		}
	}
}
