package ポケットンスター;

public class Pocketon {

	String name ;
	String type ;
	int power ;
	int diffcult ;
	int getted ;
	
	Pocketon (String n,String t,int p,int d ){
		
		name = n;
		type = t;
		power = p;
		diffcult = d;
		getted = 0;
		
	}
	void display() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(power);
		System.out.println(diffcult);
	}
}
