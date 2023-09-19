package course22;

public class Practice03 {

	public static void main(String[] args) {
		String[][] w = new String[3][3];
		w[0][0] = "o";
		w[0][1] = "x";
		w[0][2] = "o";

		w[1][0] = "x";
		w[1][1] = "o";
		w[1][2] = "x";

		w[2][0] = "o";
		w[2][1] = "o";
		w[2][2] = "o";

		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("現在の要素は" + w[i][j]);
				if (w[i][j].equals("o")) {
					count = count + 1;
				}
			}
			System.out.println();
		}
		System.out.println("oの数は"+count+"です。");
	}
}
