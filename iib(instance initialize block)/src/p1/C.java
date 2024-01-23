package p1;

public class C {
	int x=10;
	int y=2;
	{
		int y=5;
		System.out.println("This is first IIB");
		System.out.println(y);
	}
	C(){
		System.out.println(x);
		System.out.println(y);
		System.out.println("this is construction of class C");
	}
	{
		y=10;
		System.out.println("This is second IIB of class B");
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		System.out.println("this is main start");
		// IIB called first then construction
		C c1=new C();
		C c2=new C();
		System.out.println(c1.y);
		
		c1.x=50;
		System.out.println(c1.x);
		System.out.println("This is main end");
	}

}
