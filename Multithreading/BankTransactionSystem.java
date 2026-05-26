package org.snad.multithreading;

public class BankTransactionSystem {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		
		Customer c1 = new Customer(bankAccount,"Sai");
		Customer c2 = new Customer(bankAccount,"Anu");
		c1.start();
		c2.start();
		
	}

}
class BankAccount{
	int balance = 10000;
	
	public synchronized void withdraw(int amount) {
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName()+" withdrawing "+amount);
			balance = balance-amount;
			System.out.println("Remaining balance "+balance);
		}else {
			System.out.println(Thread.currentThread().getName()+" : Insufficient balance");
		}
		
	}
}
class Customer extends Thread{
	BankAccount bankAccount;
	Customer(BankAccount bankAccount,String name){
		super(name);
		this.bankAccount = bankAccount;	
	}
	@Override
	public void run() {
		bankAccount.withdraw(7000);
	}
}
