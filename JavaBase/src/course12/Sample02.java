package course12;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変則系（ifとの組み合わせ）
		int x = 0;

		do {
			if (x < 3) {
				System.out.println("ifとの組み合わせだよ");
			} else if (x == 2) {
				break;
			}
			x++;
		} while (x < 3);
		
	}

}
