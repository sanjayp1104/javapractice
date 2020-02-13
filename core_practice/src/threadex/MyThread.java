package threadex;

/**
 * @author sanjay.pamarthi
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for(int i=1;i<=10;i++) {
			System.out.println(th.getName()+" - value "+i);
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
