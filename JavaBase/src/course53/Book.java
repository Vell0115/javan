package course53;

public class Book {
	private String title;
	private int price;

	public Book() {
		System.out.println("動いたよ。"); //コンストラクタの結果
	}//オーバーロード

	public Book(String userInputTitle) {
		this.title = userInputTitle;
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
	}//コンストラクタの結果//オーバーロード

	//ここにタイトルと価格をセットするコンストラクタを書いてみよう////

	public Book(String userInputTitle,int userInputPrice) {
		this.title = userInputTitle;
		System.out.println("タイトルに初期値として" + userInputTitle + "をセットしました。");
	
		this.price =userInputPrice;
		System.out.println(100);
	}
	//////////////////////////////////////////////////////////////////

	////////////////以下getter及びsetter(今日は無視してOK）/////////////
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	////////////////以下getter及びsetter(今日は無視してOK）/////////////
}
