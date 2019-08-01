import my.util.*;
public class NotebookApp{
	public static void main(String[] args){
		int page=Common.input("本のページ数を入力してください>");
		int price=Common.input("本の価格を入力してください>");
		Book book=new Book(page,price);
		page=Common.input("ノートのページ数を入力してください>");
		price=Common.input("ノートの価格を入力してください>");
		Notebook notebook=new Notebook(page,price);
		while(true){
			int select=Common.input("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			switch(select){
			case 1:
				book.info();
				break;
			case 2:
				notebook.info();
				break;
			case 3:
				String note=Common.inputStr("書き込む内容を入力してください>");
				notebook.append(note);
				break;
			default:
				Common.print("アプリケーションを終了します");
				return;
			}
		}

	}
}
