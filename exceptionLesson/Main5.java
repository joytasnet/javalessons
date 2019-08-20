import java.io.*;
public class Main5{
	public static void main(String[] args){
		String name="sample.txt";
		FileReader fr=null;
		try{
			fr=new FileReader(name);
			char c1=(char)fr.read();
			System.out.println(c1);
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}finally{
			try{
			fr.close();
			}catch(Exception e){
			}
		}
	}
}
