import java.util.*;
import my.util.*;
public class AnimalApp{
	public static void main(String[] args){
		String[] kinds={"犬","豚","猫"};
		Random rand=new Random();
		List<Animal> list=new ArrayList<>();
		while(true){
			int select=Common.input("どうする?１集める,2.眺める、3.終わり>");
			switch(select){
			case 1:
				int idx=rand.nextInt(kinds.length);
				Common.print(kinds[idx]+"をみつけました！");
				String name=Common.inputStr("名前をつけてください>");
				switch(idx){
				case 0:
					list.add(new Dog(name));
					break;
				case 1:
					list.add(new Pig(name));
					break;
				case 2:
					list.add(new Cat(name));
					break;
				}
				break;
			case 2:
				if(list.isEmpty()){
					Common.print("まだ一匹も動物がいません");
					break;
				}
				for(Animal a:list){
					a.cry();
					if(a instanceof Cat){
						((Cat)a).sleep();
					}
				}
				break;
				case 3:
				Common.print("アプリケーションを終了します");
				return;
			}
		}
	}
}
