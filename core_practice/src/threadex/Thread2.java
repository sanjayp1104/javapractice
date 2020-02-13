package threadex;

public class Thread2 {
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th1);
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		
		for(int i=1;i<=110;i++) {
			System.out.println(t.getName()+" - value "+i);
		}
	}

}
