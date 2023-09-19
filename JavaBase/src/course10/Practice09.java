package course10;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		System.out.println("曜日を設定してください");
		Scanner stdIn = new Scanner(System.in);
		
		String day = stdIn.next();
		switch(day) {
		case "日":
		case "火":	
		case "金":
			System.out.println("休診日です");
			break;
			
		case "月":
		case "水":	
		case "木":
		case "土":	
			System.out.println("休診日です");
			break;	
			
			
		default:
			System.out.println("正しく打ち込んでください");
	
			
			
		
		
		
		
		}
		
	}

}
