package course20;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] sgk = { "x", "y", "x", "y", "x" };

		int z = 0;

		for (String moji : sgk) {

			if ("x".equals(moji)) {
				z = z + 1;
			}
		}
		System.out.println(z);
	}
}
