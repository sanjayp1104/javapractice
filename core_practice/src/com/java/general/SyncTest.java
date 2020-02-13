package com.java.general;

public class SyncTest {
	public static void main(String[] args) {
		final SyncExample exe = new SyncExample();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					exe.printNumbers(3);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		new Thread(r,"ONE").start();
		new Thread(r,"TWO").start();
	}
}
