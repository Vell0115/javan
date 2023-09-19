package course21;

import java.util.Scanner;

public class ArrQuestion03 {

	public static void main(String[] args) {
		System.out.println("参照したい情報を選択してください。");
		System.out.println("1:台風件数");
		System.out.println("2:地震件数");
		System.out.println("3:降水量");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.println("年別か月別かを選択してください。");
		System.out.println("1:年別");
		System.out.println("2:月別");
		int y = stdIn.nextInt();
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int[] quake = { 153, 127, 130, 109, 118, 164, 130, 103, 104, 123, 141 };
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		if (x == 1) {
			if (y == 2) {
				System.out.println("見たい月を入力してください。");
				int m = stdIn.nextInt();
				System.out.println(m + "月の台風は" + typhoon[m - 1] + "件です。");
			}
		}
		if (x == 1) {
			if (y == 1) {
				int z = 0;
				for (int i = 0; i < typhoon.length; i++) {
					z = z + typhoon[i];
				}
				System.out.println("一年間に起こった台風は" + z + "件です。");
			}
		}
		if (x == 2) {
			if (y == 2) {
				System.out.println("見たい月を入力してください。");
				int m = stdIn.nextInt();
				System.out.println(m + "月の地震は" + quake[m - 1] + "件です。");
			}
		}
		if (x == 2) {
			if (y == 1) {
				int c = 0;
				for (int i = 0; i < quake.length; i++) {
					c = c + quake[i];
				}
				System.out.println("一年間に起こった地震は" + c + "件です。");
			}
		}
		if (x == 3) {
			if (y == 2) {
				System.out.println("見たい月を入力してください。");
				int m = stdIn.nextInt();
				System.out.println(m + "月の降水量は" + rain[m - 1] + "件です。");
			}
		}
		if (x == 3) {
			if (y == 1) {
				int v = 0;
				for (int i = 0; i < rain.length; i++) {
					v = v + rain[i];
				}
				System.out.println("一年間に起こった降水量は" + v + "件です。");
			}
		}
	}
}
