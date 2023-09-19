package course26;

import java.util.Scanner;

public class HighCard {
	

	//初期　勝利数
	int wincount = 0;

	//所持金
	int syozi = 1000;

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		

		judge();
	}

	static String judge() {
		System.out.println("続ける場合は2、終了する場合は9999を入力してください。");

		String kaesu ="";
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		
		if(a == 9999) {
			kaesu ="END";
		} else {
			kaesu = "CONT";
		}
		
		
		return kaesu;
	}
}
