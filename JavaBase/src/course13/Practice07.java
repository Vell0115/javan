package course13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数値を入力してね。");
		Scanner stdIn = new Scanner(System.in);
		
		int yy =stdIn.nextInt();
		
		for(int i=1; i<=yy ; i++) {
			System.out.println("現在"+i+"回目のループです");
			int y =i%2;
			
		if (y==0) {
			System.out.println("偶数だyo");
		}else {
			System.out.println("奇数だyo");
			
		
	}
		if (i >= 100) {
			System.out.println("どれだけ回すの");
	}
}
}
}