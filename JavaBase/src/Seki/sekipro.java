package Seki;
import java.util.Random;
import java.util.Scanner;

public class sekipro {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand =new Random(36);
		int randm =rand.nextInt();
		Scanner stdIn = new Scanner(System.in);
   
		System.out.println("～席替えプログラム～");
		Scanner stdIn = new Scanner(System.in);
		
		int[][] seki = { { 1, 2, 3, 4, 5, 6 },
				{ 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 },
				{ 31, 32, 33, 34, 35, 36 } };
		//席の表示
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(seki[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("席替えのやり方を選んでください");
		System.out.println("1,完全ランダムの席替え");
		System.out.println("2,貴方が全ての席を指定する席替え");
		System.out.println("※数字で入力してね！");
		int x5 = stdIn.nextInt();
		if(x5==1) {
		
		}
		if(x5==2) {
			System.out.println("席を指定してください！※左上から右に進んでいきます");
			int s1=stdIn.nextInt();
			int s2=stdIn.nextInt();
			int s3=stdIn.nextInt();
			int s4=stdIn.nextInt();
			int s5=stdIn.nextInt();
			int s6=stdIn.nextInt();
			int s7=stdIn.nextInt();
			int s8=stdIn.nextInt();
			int s9=stdIn.nextInt();
			int s10=stdIn.nextInt();
			int s11=stdIn.nextInt();
			int s12=stdIn.nextInt();
			int s13=stdIn.nextInt();
			int s14=stdIn.nextInt();
			int s15=stdIn.nextInt();
			int s16=stdIn.nextInt();
			int s17=stdIn.nextInt();
			int s18=stdIn.nextInt();
			int s19=stdIn.nextInt();
			int s20=stdIn.nextInt();
			int s21=stdIn.nextInt();
			int s22=stdIn.nextInt();
			int s23=stdIn.nextInt();
			int s24=stdIn.nextInt();
			int s25=stdIn.nextInt();
			int s26=stdIn.nextInt();
			int s27=stdIn.nextInt();
			int s28=stdIn.nextInt();
			int s29=stdIn.nextInt();
			int s30=stdIn.nextInt();
			int s31=stdIn.nextInt();
			int s32=stdIn.nextInt();
			int s33=stdIn.nextInt();
			int s34=stdIn.nextInt();
			int s35=stdIn.nextInt();
			int s36=stdIn.nextInt();
			int[][] seki2 = { { s1, s2, s3, s4, s5, s6 },
					{ s7, s8, s9, s10, s11, s12 },
					{ s13, s14, s15, s16, s17, s18 },
					{ s19, s20, s21, s22, s23, s24 },
					{ s25, s26, s27, s28, s29, s30 },
					{ s31, s32, s33, s34, s35, s36 } };
			//席の表示
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					System.out.print(seki2[i][j] + ",");
				}
				System.out.println();	
			}	
			System.out.println("席を確定しますか？");
			System.out.println("1,このまま確定する");
			System.out.println("2、変更する");
		
		}
		int x10 = stdIn.nextInt();
		//確定の場合の席表示		
		if(x10==1) {
		System.out.println();
		}
		//変更の場合の席座標入力
		if(x10==2) {
		System.out.println("入れ替え元を入力してね[0][0]の左側");
		int x1 = stdIn.nextInt();

		System.out.println("入れ替え元を入力してね[0][0]の右側");
		int x2 = stdIn.nextInt();

		System.out.println("入れ替え先を入力してね[0][0]の左側");
		int z1 = stdIn.nextInt();

		System.out.println("入れ替え先を入力してね[0][0]の右側");
		int z2 = stdIn.nextInt();

		///入れ替え実行///
		int save = 0;
		save = seki[z1][z2];
		seki[z1][z2] = seki[x1][x2];
		seki[x1][x2] = save;
		}
}
}