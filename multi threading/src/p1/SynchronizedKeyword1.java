package p1;

public class SynchronizedKeyword1 {
	int balance=0;
	public static void main(String[] args) {
		SynchronizedKeyword1 s=new SynchronizedKeyword1();
		s.account();
		System.out.println(s.balance);
	}
	public void account() {
		Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				add();
			}
		});
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				sub();
			}
		});
		t.start();
		t1.start();
		try {
			t.join();
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public synchronized void add() {
		for(int i=0;i<2000;i++) {
			balance=balance+i;
		}
		
	}
	public synchronized void sub() {
		for(int i=0;i<1000;i++) {
			balance=balance-i;
		}
	}
	
}
