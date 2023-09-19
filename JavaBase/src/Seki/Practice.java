package Seki;

import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] kako = new int[36];

		Random rand = new Random();

		int x = rand.nextInt(36) + 1;

		for (int i = 0; i < kako.length; i++) {
		
			if (kako[i] == 0) {
		 x = rand.nextInt(36) + 1;

		 i = 0;
			}
			System.out.println(x);
		}
		
	}
}