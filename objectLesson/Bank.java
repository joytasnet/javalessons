public class Bank{
	String accountNumber;
	int balance;
	@Override
	public String toString(){
		return "\\"+this.balance+"(口座番号="+this.accountNumber+")";
	}
	@Override
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(o instanceof Bank){
			Bank b=(Bank)o;
			if(this.accountNumber.trim().equals(b.accountNumber.trim())){
				return true;
			}
		}
		return false;
	}
}
