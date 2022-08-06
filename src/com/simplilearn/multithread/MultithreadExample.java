package com.simplilearn.multithread;

class MultiRunnable implements Runnable {
	@Override
	public void run() {
		// Place where thread will have its own execution enviornments
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i);
		}
	}
}

public class MultithreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. Create object of Runnable class
		MultiRunnable runnableObj = new MultiRunnable();
		
		runnableObj.run();
		
		// 2. Can create Thread Object and pass runnable
		Thread t1 = new Thread(runnableObj);
		
		
		// 3. Invoke start method
		t1.start();
		
		// NEVER USER JOIN METHOD
		//t1.join();
		
		Thread t2 = new Thread(runnableObj);
		t2.start();
		
		System.out.println("Main Thread completes");
		
	}

}
