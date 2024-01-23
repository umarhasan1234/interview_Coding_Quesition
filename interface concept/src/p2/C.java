package p2;
// Here in case of class and interface , if we want to inherit both then 
// firstly we use extends and then we use implements keyword.
public class C extends B implements A{
	public void test() {
		System.out.println("This is test method of interface class A ");
	}
	public static void main(String[] args) {
		C c1=new C();
		c1.test();
		c1.test1();
	}

}
