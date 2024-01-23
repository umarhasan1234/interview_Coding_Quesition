package p1;

public class B {
	int x=10;
	int y;
	B(){
		System.out.println(x);
		System.out.println("this is construction of class B");
	}
	{
		y=20;
		System.out.println("This is IIB of class B");
	}
	
	public static void main(String[] args) {
		// IIB called first then construction
		System.out.println("This is main class");
		B b1=new B();
		
	}

}
