package course28;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//インスタンス
		//「hu1」はhuman1のインスタンス（）
		//インスタンスに対してパラメータを設定する。
		Human hu1 =new Human();
		hu1.name ="坂本";
		hu1.kotoba ="ラブ＆ピース";		
	System.out.println(hu1.name);
	
	hu1.hp = 50;
	hu1.neru();
	

	Chr numata = new Chr ();
	numata.attack = 280;
	numata.def = 20;
	numata.spd = 50;
	numata.love =20;
	numata.mp = 100;
	numata.hp = 30;
	
	//Chrクラスのインスタンス「kajima」を生成
	//パラメータを設定してみよう。
	Chr kajima = new Chr ();
	kajima.attack = 400;
	kajima.def = 20;
	kajima.spd = 30;
	kajima.love = 0;
	kajima.mp = 0;
	kajima.hp = 50;
	
	kajima.naguru(kajima.attack,numata.def);
	if (numata.hp > 0) {
		System.out.println("勇者ヌマタは死んだ");
	}
}
}