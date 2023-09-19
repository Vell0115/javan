package course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Student st = new Student();
		st.name = "根本晴";
		st.no = 21;
		
		Student st2 =new Student();
		st2.name = "藤平 陸仁";
		st2.no =24;
		
		
		
		Student []myfriend = new Student[2] ;
		
		myfriend[0] = st;
		myfriend[1] =st2;
	
		for (int i = 0; i<2; i++ ) {
		System.out.println(myfriend[i].name);
	}
}
}
