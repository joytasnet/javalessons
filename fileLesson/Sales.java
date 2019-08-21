public class Sales{
	private String year;
	private int salesA;
	private int salesB;
	public Sales(String year,int salesA,int salesB){
		this.year=year;
		this.salesA=salesA;
		this.salesB=salesB;
	}
	@Override
	public String toString(){
		return String.format("%s年度の製品Aの売上高%d,製品Bの売上高%d",this.year,this.salesA,this.salesB);
	}
	public String toCSV(){
		return String.format("%s,%d,%d",
				this.year,this.salesA,this.salesB);
	}
}
