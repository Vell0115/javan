package course24;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = 30;
		bai(a);
		String o = "引数だよ";
		moji(o);
		int b = 50;
		int c = 40;
		niko(b, c);
		int tensu = 100;
		calledMethod(tensu);

	}

	static void bai(int a) {

		System.out.println(a * 2 + "です");
	}

	static void moji(String x) {
		System.out.println(x);
	}

	static void niko(int money, int c) {
		System.out.println(money + c);
	}

	static void calledMethod(int d) {

		System.out.println("引数で受け取った値は" + d + "です");
	}
}