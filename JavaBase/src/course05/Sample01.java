package course05;

import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加算します");

		System.out.println("xの値を入力してください");

		//変数「x」に入力した内容が
		//格納される。
		double x = stdIn.nextDouble();

		System.out.println("yの値を入力してください");

		double y = stdIn.nextDouble();

	
	System.out.println("zの値を入力してください");
	int z =stdIn.nextInt();
		
		System.out.println("x + y + z =" + (x + y + z));
	}
}