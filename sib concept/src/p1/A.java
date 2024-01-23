package p1;

public class A {
	int a=1;
	int b=4;
	static int  c=5;
	static int d;
	{
		b=10;
		d=60;
		System.out.println("This is first IIB");
		System.out.println(c);
		System.out.println(b);
		System.out.println(d);
	}
	static {
		// b=60;// we can not initialize non static variable in static
		System.out.println(c);
		c=60;
		d=70;
		System.out.println("this is SIB");
		System.out.println(c);
		System.out.println(d);
	}
	 
	{
		b=80;
		c=90;
		System.out.println("This is second IIB");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	static {
		System.out.println(c);
		c=100;
		d=110;
		System.out.println("this is SIB second");
		System.out.println(c);
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		System.out.println("Main start");
		A a1 = new A();
		System.out.println(a1.b);
		System.out.println(d);
		System.out.println(c);
		c=150;
		d=160;
		System.out.println(c);
		System.out.println(d);
		A a2=new A();
		System.out.println(c);
		System.out.println(d);
	}


}
