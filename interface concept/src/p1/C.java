package p1;

public class C implements A,B {
	@Override
	public void test1() {
		System.out.println("This is abstract method of interface class B");
	}
	@Override
	public void test() {
		System.out.println("This is abstract class of interface class A");
	}
//	public static void main(String[] args) {
//		C c1=new C();
//		c1.test1();
//		c1.test();
//		
//	}

}
