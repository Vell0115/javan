package course08;

import java.util.Scanner;

public class Sample04 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		
		System.out.println("魚、肉、野菜で何が好きですか？");
		String like = stdIn.next();
		
		//switch文鉄板構文
		switch(like) {
		case"魚":
			System.out.println("魚が好きです。");
			break;
			//breakはこれ以降の判定を消す
		case"肉":
			System.out.println("肉が好きです。");
            break;		
		default:
			System.out.println("野菜派です。");
		
		
		}
		
		
		
	}

}
