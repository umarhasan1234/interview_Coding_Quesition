package p1;

public class A {
	int x=10;
	int y;
	{
		y=20;
		System.out.println("This is non-static (instance) initialize block");
	}
	
	public static void main(String[] args) {
		// after object creation iib called first
		System.out.println("This is main class");
		A a1=new A();
		
	}

}
