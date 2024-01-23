package p2;

public class B {

	//explicit down casting
	
	public static void main(String[] args) {
		long l=10;
		int i=(int) l;//here we cast the long memory  into short memory 
		System.out.println(i);
		
		float f=10.3f;
		long a=(long)f;//here short memory get loaded into long memory but data lose happen
		System.out.println(a);
		
		// by default compiler get convert char into int value
		int x='a';
		System.out.println(x);
	}
}
