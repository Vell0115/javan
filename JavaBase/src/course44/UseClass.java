package course44;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human human = new Human();
		Animal animal = new Animal();
		//Humanクラス
		human.setName("システムタロウ");
		human.setHobby("プログラミング");
		human.setWeight(60000);

		human.disp();
		human.dispWeight();

		human.eat("ハンバーガー", 1200);

		human.dispWeight();

		//Animalクラス
		animal.setName("サイ");
		animal.setWeight(7000000);
		animal.setKari("角で相手を粉砕する");
		animal.setJumyou(30);
	
		animal.display();

	}

}

