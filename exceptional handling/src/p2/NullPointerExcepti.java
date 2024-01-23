package p2;

public class NullPointerExcepti {
	int x=39;
	static int y=498;
	
	public static void main(String[] args) {
		NullPointerExcepti n=null;
		try {
			System.out.println(y);
			System.out.println(n.x);
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception occur");
			e.printStackTrace();
		}
		System.out.println("Code successfull run");
	}

}
