package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] mygroup = new String[3];
		        mygroup[0] = "たにぐち";
				mygroup[1] = "まさくに";
				mygroup[2]= "だいご";
		
				for (int i = 0; i < 3; i++ ){
				System.out.println("友達の名前は"+ mygroup[i]);
		
		int[] mygroupnum = new int[3];
		mygroupnum[0] = 17; 
		mygroupnum[1] = 7;
		mygroupnum[2] = 23;
		
		
		int[] myNum = new int[3];
		
		myNum[0] = 10; 
		myNum[1] =50;
		int q = myNum[0];
		int z = myNum[1];
		myNum[2] = q + z;
		
		
		Scanner stdIn = new Scanner(System.in);
		
		int[] myNumScan = new int[3];
		
		        myNumScan[0] = 10;
				myNumScan[1] =  stdIn.nextInt();
				myNumScan[2] = myNumScan[0] + myNumScan[1];
	}
	}
}
