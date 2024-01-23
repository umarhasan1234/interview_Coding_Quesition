package p1;

public class E implements D {
	@Override
	public void test1() {
		System.out.println("This is abstract method of interface class B");
	}
	@Override 
	public void test() {
		System.out.println("This is abstract class of interface class A");
	}
	public static void main(String[] args) {
		E e1=new E();
		e1.test1();
		e1.test();
		// refrence variable of interface can be created but object is not created
		A a1=null;//refrence variable
		
		//  A a1=new A(); error because object is not allowed in interface
		
	}

}
