import java.util.*;
import java.text.*;
public class Score{
	private int score;
	private String date;
	public Score(int score,String date){
		this.score=score;
		this.date=date;
	}
	public Score(int score){
		this.score=score;
		Date today=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		this.date=sdf.format(today);
	}
	public int getScore(){
		return this.score;
	}
	public String toCSV(){
		return this.score+","+this.date;
	}
	@Override
	public String toString(){
		return this.score+" "+this.date;
	}
}
