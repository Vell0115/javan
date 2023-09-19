package course33Pair;

import java.util.Scanner;
public class Practice01 {


	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String moji ="私はJavaを勉強中です。";
		System.out.println(moji);
		
		Scanner stdIn = new Scanner(System.in);
		int x =stdIn.nextInt();
		System.out.println(x);
		
		int y =stdIn.nextInt();
		System.out.println(y);
		
	
		if(x < y) {
			System.out.println("yがでかい！");
		}if(x >y ) {
			System.out.println("xがでかい！");
		}

		if (x==y) {
			System.out.println("おなじー");
		}
		
	}


	
	
	}
  
	

