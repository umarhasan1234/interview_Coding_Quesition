package p1;

public class runnableConcept implements Runnable {
	String name;
	runnableConcept(String name){
		this.name=name;
	}
	@Override 
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println(this.name);
		}
	}
	public static void main(String[] args) {
		runnableConcept r=new runnableConcept("umar");
		Thread t=new Thread(r);
		
		t.start();
		runnableConcept r1=new runnableConcept("hasan");
		Thread t1=new Thread(r1);
		t1.start();
		runnableConcept r2=new runnableConcept("bye");
		Thread t2=new Thread(r2);
		
		
		t2.start();
		for(int i=0;i<2000;i++) {
			System.out.println("main");
		}
		
	}
}
