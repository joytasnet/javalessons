import java.io.*;
import java.text.*;
import java.util.*;
import my.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		HighScore highScore = new HighScore();// HighScoreインスタンス作成(score:0,date:"")
		/* ファイルの読み込み */
		FileInputStream fis = new FileInputStream("score.csv");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
			// データがあったらインスタンスに情報をセット
			String[] data = line.split(",");
			highScore.setScore(Integer.parseInt(data[0]));
			highScore.setDate(data[1]);
		}
		br.close();

		/* ゲーム開始 */
		Common.print("乱数ゲーム");
		Common.print("HighScore " + highScore);

		/* メインルーチン */
		while (true) {
			String input = Common.inputStr("やりますかyes…y no…n>");
			if (input.equalsIgnoreCase("n")) {
				Common.print("アプリを終了します");
				// ハイスコアを更新したら
				if (highScore.isUpdate()) {
					/* 日付をセット */
					Date today = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					highScore.setDate(sdf.format(today));
					/* ファイル書き込み */
					FileOutputStream fos = new FileOutputStream("score.csv");
					OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
					BufferedWriter bw = new BufferedWriter(osw);
					bw.append(highScore.toCSV());
					bw.flush();
					bw.close();
				}
				break;
			}
			/* 1~100000の乱数を発生させる */
			int num = Common.rand(1, 100000);
			Common.print(num);
			/* ハイスコアを更新したら */
			if (num > highScore.getScore()) {
				Common.print("newRecord");
				highScore.setScore(num);// ハイスコアをセット
				highScore.setUpdate(true);// updateをtrue
			}
		}
	}
}
