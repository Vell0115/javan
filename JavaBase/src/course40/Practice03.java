package course40;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] number = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		String[] cities = new String[5];
		cities[0] = "東京";
		cities[1] = "大阪";
		cities[2] = "千葉";
		cities[3] = "神奈川";
		cities[4] = "埼玉笑";

		for (int b = 0; b < cities.length; b++) {
			System.out.println(cities[b]);
		}

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		int sum = 0;
		for (int v = 0; v < numbers.length; v++) {
			sum = sum + numbers[v];
		}
		System.out.println(sum);
		int a = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (a < numbers[i]) {
				a = numbers[i];

			}

		}
		System.out.println(a);
		int[] numberss = new int[5];
		numberss[0] = 11;
		numberss[1] = 20;
		numberss[2] = 31;
		numberss[3] = 40;
		numberss[4] = 51;

		int q = 0;
		for (int i = 0; i < numberss.length; i++) {

		}
	}

}
