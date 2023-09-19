package course22;

import java.util.Arrays;

public class Practice02 {

	public static void main(String[] args) {

		String[][] w = new String[3][3];
		w[0][0] = "o";
		w[0][1] = "x";
		w[0][2] = "o";

		w[1][0] = "x";
		w[1][1] = "o";
		w[1][2] = "o";

		w[2][0] = "o";
		w[2][1] = "x";
		w[2][2] = "o";

		System.out.println(Arrays.deepToString(w));
	}

}
