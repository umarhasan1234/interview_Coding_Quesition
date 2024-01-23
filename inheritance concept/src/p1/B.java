package p1;

public class B extends A {
	public static void main(String[] args) {
		System.out.println("this is main method");
		A a1=new A();
		System.out.println(a1.x);
		B b1=new B();
		System.out.println(b1.x);
		System.out.println("After inheriting the static variable");
		System.out.println(a1.y);
		System.out.println(b1.y);
		test1();
		a1.test();
		b1.test();
		a1.test1();
		System.out.println(b1.z);//non-static variable are also inherited.
		
	}

}
