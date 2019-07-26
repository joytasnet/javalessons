public class PCApp{
	public static void main(String[] args){
		PC pc=new PC("TOSHIBA",30000);
		PC pc2=new PC("FUJITSU",50000);
		pc.showStatus();
		pc.price=32000;
		pc2.maker="SHARP";
		PC.total();
	}
}
