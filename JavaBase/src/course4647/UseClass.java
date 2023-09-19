package course4647;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat tama = new Cat();
		Dentaku dn = new Dentaku();

		dn.calc(1, 2);

		tama.setName("たま");
		tama.setShurui("三毛猫");
		tama.setSize("30cmぐらい");

		tama.eat("猫缶");
		tama.run();
		tama.display();
	}

}
