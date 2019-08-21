import java.io.*;
import java.util.*;
import my.util.*;
public class CSVParseLesson{
	public static void main(String[] args)throws Exception{
		List<Sales> list=new ArrayList<>();
		FileInputStream fis=new FileInputStream("sample.csv");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		while((line=br.readLine())!=null){
			//Common.print(line);
			if(line.startsWith("年度")){
				continue;
			}
			String[] vals=line.split(",");
			Sales sales=new Sales(vals[0],
					Integer.parseInt(vals[1]),
					Integer.parseInt(vals[2]));
			list.add(sales);
		}
		br.close();
		for(Sales s:list){
			Common.print(s);
		}
	}
}
