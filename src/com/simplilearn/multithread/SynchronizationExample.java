package com.simplilearn.multithread;

class Table {
	synchronized void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i * n);
		}
	}
}

class NinethRunnable implements Runnable {
	Table t;

	public NinethRunnable(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(9);
	}
}

class TenthRunnable implements Runnable {
	Table t;

	public TenthRunnable(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(10);
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		Table objT = new Table();
		
		new Thread(new NinethRunnable(objT)).start();
		new Thread(new TenthRunnable(objT)).start();
		
	}

}
