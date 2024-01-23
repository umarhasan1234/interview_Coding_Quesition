package p2;

public class B {
	public static void main(String[] args) {
		try {
			int x=10;
			int y=0;
			int z=x/y;
			System.out.println("Welcome");
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Hii");
			e.printStackTrace();
			
		}
		System.out.println("code successful run");
	}

}
