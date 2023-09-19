package course10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);
		

	

		System.out.println("xの値を入力してください");

		double x = stdIn.nextDouble();

		System.out.println("yの値を入力してください");

		double y = stdIn.nextDouble();

		if(x > y) {
			System.out.println("xがでかい");
		}if (x < y) {
				System.out.println("yがでかい");
		}
		if (x==y) {
		System.out.println("同じだよ！");
	}

		
		
		
		
	}

	}
