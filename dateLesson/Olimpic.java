import java.text.*;
import java.util.*;
public class Olimpic{
	public static void main(String[] args){
		Date now=new Date();
		Calendar olimpic=Calendar.getInstance();
		olimpic.set(2020,6,24);
		Date olimpicDate=olimpic.getTime();
		long diff=olimpicDate.getTime()-now.getTime();
		long dayMillSec=24*60*60*1000;
		long days=diff/dayMillSec;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		String today=sdf.format(now);
		System.out.println("今日は"+today);
		System.out.println("東京オリンピックはあと"+days+"日で開催されます。");
	}
}
