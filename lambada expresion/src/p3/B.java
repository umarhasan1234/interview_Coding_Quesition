package p3;

public class B {
	public static void main(String[] args) {
		A a1=()->{
			int a=5;
			int b=6;
			int c=a+b;
			return c;
		};
		int val=a1.test();
		System.out.println(val);
		
	}
	
    
}
