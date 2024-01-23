package p3;

public class FinalKeyword {
	final int x= 10;
	// x=30;  //it generate error because we can not change final variable value
	//  x=10;  // error
    public static void main(String[] args) {
    	FinalKeyword f=new FinalKeyword();
		System.out.println(f.x);
	}
}
