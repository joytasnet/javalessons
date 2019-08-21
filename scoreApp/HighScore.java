public class HighScore{
	private int score;
	private String date="";
	private boolean update=false;
	
	public void setScore(int score){
		this.score=score;
	}
	public int getScore(){
		return this.score;
	}
	
	public void setDate(String date){
		this.date=date;
	}
	
	public boolean isUpdate() {
		return update;
	}
	public void setUpdate(boolean update) {
		this.update = update;
	}
	public String toCSV(){
		return this.score+","+this.date;
	}
	@Override
	public String toString(){
		return this.score+" "+this.date;
	}
}
