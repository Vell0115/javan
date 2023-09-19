package course10;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);
		

	

		System.out.println("xの値を入力してください");

		int x = stdIn.nextInt();

		System.out.println("yの値を入力してください");

		int y = stdIn.nextInt();

		if(x > y) {
			System.out.println("xがでかい！なぜならばxは"+ x +"でyは"+y+"だから");
		}if (x < y) {
				System.out.println("yがでかい！なぜならばyは"+ y +"でxは"+x+"だから");
		}
		
		
	}

}
