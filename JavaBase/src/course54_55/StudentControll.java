package course54_55;

public class StudentControll {
	public static void main(String[] args) {

		Student me =new Student(21,"根本晴");
		Student tonari =new Student(25,"溝口真矢");
		
		Student[] mymen =new Student[2];
		mymen[0] = me;
		mymen[1] =tonari;
		
		mymen[1].setName("伊藤功惺");

		System.out.println(mymen[0].getName());
		
		
	}
}