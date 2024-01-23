package p1;

public class ThreadConcept  extends Thread{
	public static void main(String[] args) {
		ThreadConcept t=new ThreadConcept();
		t.start();
		for(int i=0;i<1000;i++) {
			System.out.println("main");
		}
		
	}
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("run");
		}
	}

}
