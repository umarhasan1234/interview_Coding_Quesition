package objectCreationConcept;

public class B extends A{
	
	public void bClass() {
		System.out.println("this is b class");
	}
	
	@Override
	public void overrideClassOfA() {
		System.out.println("this is B of overiride");
	}
	
	
	public static void main(String[] args) {
		A a1=new A();
		A a2=new B();
	//	B b2=new A();          child variable  parent ke object ko nhi rakh skta  hai
		B b1=new B();
		
		//      agar method access ka baat ho to A class ka method B me aa chuka hai isliye B sb ko access kr lega lekin 
		//      B class ka method to A class  me nhi gya hhai n isliye access nhi hoga aur error batayega
		
		a1.aClass();
	//	a1.bClass();
	//	a2.bClass();
		a2.aClass();
		b1.aClass();
		b1.bClass();
		a1.overrideClassOfA();
		a2.overrideClassOfA();
		b1.overrideClassOfA();
		
		
	}
}
