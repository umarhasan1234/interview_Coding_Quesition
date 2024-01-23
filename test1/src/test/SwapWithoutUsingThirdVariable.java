 package test;

public class SwapWithoutUsingThirdVariable {
	public static void main(String[] args) {
		int a=9;
		int b=10;
		SwapWithoutUsingThirdVariable v=new SwapWithoutUsingThirdVariable();
		v.swap(a,b);
		
	}
	public void swap(int x,int y) {
		y=x+y;
		x=y-x;
		y=y-x;
		System.out.println(x+" "+y);
	}

}
