package p1;

public class A {
	// auto up casting 
	
	public static void main(String[] args) {
		int x=10;
		long y=x;
		System.out.println(y);//auto upcasting
		
		float fl=12.3f;
	//	long l=f1;//error Because in that case it lose the .3 value of f1
		// but in the below code watch carefully
		long a=10;
		float f=a;//not generate error 
	//	int i=a;//error 
		System.out.println(f);
	}

}
