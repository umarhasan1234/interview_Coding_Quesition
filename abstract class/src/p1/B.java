package p1;

public class B extends A {
	public void test() {
		System.out.println("This is test incomplete method of abstract class A");
	}
	public static void main(String[] args) {
		B b1=new B();
		b1.test();
		b1.test1();
		
		
	}

}
