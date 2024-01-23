package p1;

public class B implements A {
	@Override
	public void test() {
		System.out.println("This is test method of functional interface");
		
	}
	public static void main(String[] args) {
		B b1=new B();
		b1.test();
	}

}
