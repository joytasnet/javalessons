public class Empty{
	String name;
	@Override
	public String toString(){
		return "名前:"+this.name;
	}
	@Override
	public boolean equals(Object o){
		if(this==o){return true;}
		if(o instanceof Empty){
			if(this.name.equals(((Empty)o).name)){
				return true;
			}
		}
		return false;
	}
}
