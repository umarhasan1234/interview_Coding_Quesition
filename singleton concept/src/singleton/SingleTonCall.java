package singleton;

public class SingleTonCall {
	public static void main(String[] args) {
		SingleTonDesign s2=SingleTonDesign.getInstance();
		SingleTonDesign s3=SingleTonDesign.getInstance();
		SingleTonDesign s4=SingleTonDesign.getInstance();
		System.out.println(s2);
		System.out.println(s3);
		}

}
