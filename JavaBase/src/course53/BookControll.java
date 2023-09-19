package course53;

public class BookControll {
	public static void main(String[] args) {

		Book book1 = new Book(); 
		
		Book book2 = new Book("自販機");
		Book book3 = new Book("自販機",100);

		System.out.println(book3.getPrice());
		System.out.println(book3.getTitle());
		//Book book2 = new Book("ITワールド");

	}
}
