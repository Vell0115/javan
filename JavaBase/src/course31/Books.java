package course31;

public class Books {

	String name;
	int page;
	String author;

	Books(String x, int y, String z) {

		name = x;
		page = y;
		author = z;
	}
		void display() {
			System.out.println("名前"+name);
			System.out.println("ページ"+page);
			System.out.println("あう"+author);
		}
	

}
