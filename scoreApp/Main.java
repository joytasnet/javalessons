import java.util.*;
import java.io.*;
import my.util.*;
public class Main{
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("score.csv");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream fos=new FileOutputStream("score.csv");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw=new BufferedWriter(osw);
		HighScore highScore=null;
		int nowHighScore=0;
		String line;
		while((line=br.readLine())!=null){
			Common.print(line);
			String[] data=line.split(",");
			highScore=new HighScore(Integer.parseInt(data[0]),data[1]);
			Common.print(highScore);
			nowHighScore=highScore.getScore();
		}
		br.close();
		Common.print("乱数ゲーム");
		Common.print("HighScore"," ");
		if(highScore==null){
			Common.print(0);
		}else{
			Common.print(highScore);
		}
		while(true){
			String input=Common.inputStr("やりますかyes…y no…n>");
			if(input.equalsIgnoreCase("n")){
				Common.print("アプリを終了します");
				highScore=new HighScore(nowHighScore);
				bw.append(highScore.toCSV());
				bw.newLine();
				bw.flush();
				bw.close();
				break;
			}else{
				int num=Common.rand(1,100000);
				Common.print(num);
				if(num>nowHighScore){
					Common.print("newRecord");
					nowHighScore=num;
				}
			}
		}
	}
}
