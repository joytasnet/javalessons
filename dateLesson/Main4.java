import java.text.SimpleDateFormat;
import java.util.Date;
public class Main4{
	public static void main(String[] args) throws Exception{
		Date now=new Date();
		SimpleDateFormat sdf=
			new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s=sdf.format(now);
		System.out.println(s);
		Date d=sdf.parse("2011/09/22 01:23:45");
		System.out.println(d);
	}
}
