package course30f;

public class Drink {

	int price;
	int suryo;
	String name;

	//コンストラクタ追加
	//コンストラクタはメインクラスでnewをした時に自動的に発動する。
	Drink(int p,String n){
		price =p;
		name = "n";
	}

	int calcSum(int x, int y) {
		int sum = x * y;
		return sum;
	}		
	void display() {
		System.out.println(price + "円の" + name);
	}

	}


