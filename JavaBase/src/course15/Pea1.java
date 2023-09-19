package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {

		//所持金	
		int a = 10000;

		while (a > 0 && a < 50000) {
			System.out.println("今の所持金" + a + "円");
			System.out.println("掛ける金額を入力してください。");

			Scanner stdIn = new Scanner(System.in);

			//掛け金
			int b = stdIn.nextInt();

			Random rnd = new Random();

			int num1 = rnd.nextInt(7) + 1;
			int num2 = rnd.nextInt(7) + 1;
			int num3 = rnd.nextInt(7) + 1;

			System.out.println(num1 + "," + num2 + "," + num3);

			String deme = "" + num1 + num2 + num3;
			switch (deme) {

			case "111":
				System.out.println("ピンゾロ");
				a = a + (b * 5);
				System.out.println(a);
				break;

			case "222":
			case "333":
			case "444":
			case "555":
			case "666":
				System.out.println("ゾロ目");
				a = a + (b * 3);
				System.out.println(a);
				break;

			case "456":
			case "465":
			case "546":
			case "564":
			case "654":
			case "645":
				System.out.println("シゴロ");
				a = a +( b * 2);
				System.out.println(a);
				break;
			case "226":
			case "225":
			case "224":
			case "223":
			case "332":
			case "221":
			case "622":
			case "262":
			case "422":
			case "242":
			case "233":
			case "323":
			case "212":
			case "122":
				System.out.println("通常の目");
				a =(a + b);
				System.out.println(a);
				break;

			case "770":
			case "707":
			case "077":
				System.out.println("ションベン");
				a =(a - b);
				System.out.println(a);
				break;

			case "123":
			case "321":
			case "213":
			case "132":
			case "312":
			case "231":
				System.out.println("ヒフミ");
				a =(a - b);
				System.out.println(a);
				break;

			default:
				System.out.println("役無し");
				a =(a - b);
				System.out.println(a);
				break;

			}
		}
		if (a >= 50000) {
			System.out.println("ゲームクリア");
		} else {
			System.out.println("1050年地下行き");
		}
	}
}