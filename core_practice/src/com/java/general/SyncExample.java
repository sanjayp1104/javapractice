package com.java.general;

public class SyncExample {
	void printNumbers(int n) throws InterruptedException{
		
		
		synchronized (this) {
			for(int i=1;i<=n;i++) {
				System.out.println(Thread.currentThread().getName()+"  --  "+i);
				Thread.sleep(5000);
			}
		}
		
	}

}
