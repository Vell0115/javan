package course30f;

public class UseClass {
	public static void main(String[] args) {

		Drink drink = new Drink(100, "初期データ");
		drink.display();

		drink.name = "午後の紅茶";
		drink.price = 150;

	
	}
}