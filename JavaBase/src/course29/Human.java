package course29;

public class Human {

	String name;
	String address;
	String hobby;

	void talk() {
		System.out.println(this.name + ":こんにちは。私の趣味は" + this.hobby + "です。");
	}

	void run() {
		System.out.println(this.name + "は走った。");
	}

	void sleep() {
		System.out.println(this.name + "は寝た。");
	}

}