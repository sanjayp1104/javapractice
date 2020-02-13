package threadex;

public class Thread1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		
		for(int i=1;i<=110;i++) {
			System.out.println(t.getName()+" - value "+i);
		}
	}

}
