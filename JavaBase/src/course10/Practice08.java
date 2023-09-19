package course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("一つ目の値を入力してください");

		int x = stdIn.nextInt();

		System.out.println("二つ目の値を入力してください");

		int y = stdIn.nextInt();

		System.out.println("三つ目の値を入力してください");

		int z = stdIn.nextInt();
		
		if (x > y && x > z && y >z) {
		   System.out.println(x+"が一番大きい数値です"+y+"が二番目に大きい数値です"+z+"が三番目に大きい数値です");
	}if (x > y && x > z && z>y) {
		System.out.println(x+"が一番大きい数値です"+z+"が二番目に大きい数値です"+y+"が三番目に大きい数値です");
		
	}if (y > x && y > z && x >z) {
			System.out.println(y+"が一番大きい数値です"+x+"が二番目に大きい数値です"+z+"が三番目に大きい数値です");
	}if (y > x && y > z && z>x) {
			System.out.println(y+"が一番大きい数値です"+z+"が二番目に大きい数値です"+x+"が三番目に大きい数値です");		
		
	}if (z > y && z > x && y >x) {
				System.out.println(z+"が一番大きい数値です"+y+"が二番目に大きい数値です"+x+"が三番目に大きい数値です");
	}	if (z > y && z > x && x>y) {
			System.out.println(z+"が一番大きい数値です"+x+"が二番目に大きい数値です"+y+"が三番目に大きい数値です");
						
		
	}}}
		 
		
		
		
		
		
		
		


