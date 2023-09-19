package Seki;
import java.util.Random;
import java.util.Scanner;
public class aaa {
	public static void main(String[] args) {
		Random rand =new Random(36);
		Scanner stdIn = new Scanner(System.in);
		
		
		int[][] seki = { { 1, 2, 3, 4, 5, 6 },
				{ 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 },
				{ 31, 32, 33, 34, 35, 36 } };
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				
				int a =stdIn.nextInt();
				int b =stdIn.nextInt();
				int c =stdIn.nextInt();
				int d =stdIn.nextInt();
				 {
			
					System.out.println(seki[i][j]);
				}
	}System.out.println();
}
}
}