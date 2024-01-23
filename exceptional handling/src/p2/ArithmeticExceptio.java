package p2;

public class ArithmeticExceptio {
	public static void main(String[] args) {
	
		try {
			int x =10;
			int y=0;
			int z=x/y;// Arithmetic Exception occur
			System.out.println("Welcome");
			System.out.println(z);
			
		}catch(ArithmeticException e) {
			System.out.println("exception occur");
			e.printStackTrace();
			
		}
		System.out.println("code successfull run");
	
	}

}
