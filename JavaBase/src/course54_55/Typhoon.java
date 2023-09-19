package course54_55;

public class Typhoon {

	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	
	public Typhoon() {
		System.out.println("コンストラクタが動いたよ");
	}
	public Typhoon(int userInputTyphoon,String userInputHassei,String userInputName) {
		
		this.typhoonbango =userInputTyphoon;
		this.hasseibi =userInputHassei;
		this.asiaName =userInputName;
		
	}
	//デフォルトコンストラクタ
	//引数有りコンストラクタ
	//getter,setter
	public int getTyphoonbango() {
		return typhoonbango;
	}
	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}
	public String getHasseibi() {
		return hasseibi;
	}
	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}
	public String getAsiaName() {
		return asiaName;
	}
	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}

}