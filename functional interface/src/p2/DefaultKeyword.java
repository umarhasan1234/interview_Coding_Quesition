package p2;
@FunctionalInterface
public interface DefaultKeyword {
	public void test2();
	default public void test3() {
		System.out.println("This is default test3 method of functional interface ");
		
	}

}
