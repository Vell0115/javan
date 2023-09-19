package course40;

public class Practice02 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			for (int as = 0; as < 100; as++) {

				System.out.println("現在" + as + "回目のループです。");
				if (as % 2 == 0) {
					System.out.println("偶数です");

				}
				for (int in = 10; in > 0; in--) {
					System.out.println(in);
				}
			}
		}
		int sum = 0;

		for (int p = 1; p <= 100; p++) {
			sum = sum + p;

		}
		System.out.println(sum);
	}
}