package course10;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数値を入力してください");
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		
		int num =x%2;
		
		switch(num) {
		case 1:
			System.out.println("奇数");
			break;
		default:
			System.out.println("偶数");	

		
		
		
	}
	}
}
