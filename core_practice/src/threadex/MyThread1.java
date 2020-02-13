package threadex;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		Thread th = Thread.currentThread(); 
		for (int i = 1; i <= 10; i++) {
			System.out.println(th.getName()+" - value is :" + i);
		}
		
		try
			{ 
			Thread.sleep(500); 
			}catch(Exception e)
			{
				e.printStackTrace(); 
			}
	}

}
