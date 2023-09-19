package course54_55;

import java.util.Scanner;

public class TyphoonControll {
	public static void main(String[] args) {

		System.out.println("台風情報を確認0の場合はそのまま99の場合は編集");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		if (a == 0) {
			Typhoon typ1 = new Typhoon(1, "4月８日", "マラカス");
			Typhoon typ2 = new Typhoon(2, "4月10日", "メーギー");
			Typhoon typ3 = new Typhoon(3, "6月30日", "チャバ");
			Typhoon typ4 = new Typhoon(4, "7月1月", "アイレー");
			Typhoon typ5 = new Typhoon(5, "7月28日", "ソングダー");
			Typhoon typ6 = new Typhoon(6, "7月31日", "トローセス");
			Typhoon typ7 = new Typhoon(7, "8月9日", "ムーラン");
			Typhoon typ8 = new Typhoon(8, "8月12日", "メアリー");
			Typhoon typ9 = new Typhoon(9, "8月22日", "マーゴン");

			Typhoon[] TyphoonList = new Typhoon[9];
			TyphoonList[0] = typ1;
			TyphoonList[1] = typ2;
			TyphoonList[2] = typ3;
			TyphoonList[3] = typ4;
			TyphoonList[4] = typ5;
			TyphoonList[5] = typ6;
			TyphoonList[6] = typ7;
			TyphoonList[7] = typ8;
			TyphoonList[8] = typ9;

			for (int i = 0; i < 9; i++) {
				System.out.println(TyphoonList[i].getAsiaName());
			}
			if (a == 99) {
				System.out.println("変更する台風番号を指定してください");
				int b = stdIn.nextInt();
				
				if(b ==1) {
					System.out.println(
							);
				}
			}

		}
	}
}