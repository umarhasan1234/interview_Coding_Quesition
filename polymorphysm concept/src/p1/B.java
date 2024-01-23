package p1;

public class B extends A {
	@Override
	public void test() {
		System.out.println("This is class B of test method");
	}

	public void testing() {
		System.out.println("this is class B of testsing");
	}
	 
	@Override
	public int test1() {
		int x=20;
		System.out.println("This is class B of test1 method");
		return x;
	}
	public static void main(String[] args) {
		// if we create object of B then
		B b1=new B();
		b1.test();
		b1.test1();
		b1.testing();
		b1.test3();
		
		//If we create object of class A
		
		A a1=new A();
		a1.test();
		a1.test1();
		//a1.testing();// this gives us error  because it is not in class A 
		a1.test3();
		
	}
	

}
