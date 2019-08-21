import java.io.*;
import java.util.*;
import my.util.*;
public class CFW{
	public static void main(String[] args) throws Exception{
		List<Sales> list=new ArrayList<>();
		for(int i=2018;i<=2025;i++){
			Sales sales=new Sales(i+"",Common.rand(180,250),
					Common.rand(800,1300));
			list.add(sales);
		}
		//Common.print(list);
		FileOutputStream fos=new FileOutputStream("sample2.csv");
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		BufferedWriter bw=new BufferedWriter(osw);
		bw.append("年度,製品A,製品B");
		bw.newLine();
		for(Sales s:list){
			bw.append(s.toCSV());
			bw.newLine();
		}
		bw.flush();
		bw.close();
		Common.print("書き込み完了");
	}
}
