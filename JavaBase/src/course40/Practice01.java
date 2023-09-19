package course40;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int number = 15;

		if (number >= 10) {
			System.out.println("でか！！！");

			int age = 20;
			if (age >= 20) {
				System.out.println("大人っすね！");
			} else {
				System.out.println("キッズだね^^");
			}

			int score = 92;
			if (score >= 90) {
				System.out.println("Excellent");

				if (score <= 90) {
					if (score >= 80) {
						System.out.println("Good");
					}
				}
			} else {
				System.out.println("勉強しましょう。");
			}
		}
		boolean isRaining = true;
		if (isRaining) {
			System.out.println("傘をもってけーーー");
		} else {
			System.out.println("よい一日を");
		}

		int num = 21;
		if (num % 2 == 0) {
			System.out.println("偶数でっせ");
		} else {
			System.out.println("奇数だよ");
		}
	}
}
