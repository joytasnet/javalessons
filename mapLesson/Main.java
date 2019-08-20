import java.util.*;
import my.util.*;
public class Main{
	public static void main(String[] args){
		Map<String,String> map=new HashMap<>();
		map.put("月","Lunes(ルネス)");
		map.put("火", "Martes(マルテス)");
		map.put("水", "Miércoles(ミエルコレス)");
		map.put("木", "Jueves(フエベス)");
		map.put("金", "Viernes(ビエルネス)");
		map.put("土", "Sábado(サバド)");
		map.put("日", "Domingo(ドミンゴ)");
		while(true){
			String input=Common.inputStr("調べたいスペイン語の曜日を入力してください。>");
			if(map.containsKey(input)){
				Common.print(input,":");
				Common.print(map.get(input));
			}else{
				Common.print("アプリケーションを終了します。");
				break;
			}
		}
	}
}
