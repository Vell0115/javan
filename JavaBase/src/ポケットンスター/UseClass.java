package ポケットンスター;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		Trainer trainer = new Trainer();

		System.out.println("メニューを選択してください");
		int x = stdIn.nextInt();
		System.out.println("1…捕獲");
		System.out.println("2…図鑑を見る。");
		System.out.println("3…バトル");
		System.out.println("99…プログラムを終了する");

		//捕獲
		if(x==1) {
			System.out.println("捕獲したいポケトンの名前を入力してください");
			System.out.println("捕獲したいポケトンのタイプを入力してください(炎、水、地面、草)");
			System.out.println("捕獲したいポケトンの戦闘力を入力してください");
			System.out.println("捕獲したいポケトンの戦闘力を入力してください");
			
		}
		
		//Trainer trainer();
		//Pocketon Pocke("名前","タイプ","戦闘力","捕獲難易度");

	}

}
