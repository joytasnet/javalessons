public class MusicApp{
	public static void main(String[] args){
		try{
			throw new UnsupportedMusicFileException("未対応のファイルです");
		}catch(UnsupportedMusicFileException e){
			e.printStackTrace();
		}
	}
}
