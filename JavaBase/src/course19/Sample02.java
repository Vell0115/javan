package course19;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String a ="ねもと";
		String b ="ひろむ";
		String c ="だいご";
		String d ="まさくに";
		String e ="はるや";		
		String f ="さかもと";
		String g ="やすだ";
		String h ="ふじひらりくと";
		String j ="そら";
		//配列の鉄板構文
		//[]の事を要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
				nameList[0] = "たにぐち";
				nameList[1] = "ねもと";
				nameList[2] = "だいご";
				nameList[3] = "まさくに";
				nameList[4] = "はるや";
				nameList[5] = "さかもと";
				nameList[6] = "やすだ";
				nameList[7] = "ふじひら";
				nameList[8] = "そら";
				
				for (int i = 0; i < 10; i++) {
					System.out.println("俺の友達の名前は" + nameList[i]+"だ。");
				}
	}

}
