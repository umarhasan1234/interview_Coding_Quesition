package singleton;

public final class SingleTonDesign {
	private SingleTonDesign() {
		
	}
	static SingleTonDesign s1=new SingleTonDesign();
	public static SingleTonDesign getInstance() {
		return s1;
	}

}
