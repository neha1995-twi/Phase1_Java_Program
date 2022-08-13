package com.simplilearn.multithread;

class Account {
	int balance = 5000;

	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("Going to withdraw amount :" + amount);

		if (this.balance < amount) {
			System.out.println("In sufficient balance, wait until someone notifies..! Current Balance: "+ this.balance);
			this.wait();
		}
		this.balance -= amount;
		System.out.println("Withdraw completed successfully..");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit...");
		this.balance += amount;
		System.out.println("Deposit Completed..");
		this.notify();
	}
}

public class InterthreadCommunicationExample {

	public static void main(String[] args) {

		Account account = new Account();
		
		Thread withdrawThread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					account.withdraw(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread depoitThrad = new Thread(new Runnable() {
			@Override
			public void run() {
				account.deposit(5000);
			}
		});

		
		withdrawThread.start();
		depoitThrad.start();
	}

}
