package org.snad.multithreading;

public class MutliThreadingExample {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		System.out.println("State after object creation: " + t1.getState());
		Runnable1 r = new Runnable1();
		Thread t = new Thread(r);
		t.start();
		//t1.sleep(5000);//pauses the current thread for a specified time and moves it to TIMED_WAITING state
		t1.start();
		 System.out.println("State after start: " + t1.getState());
		t1.join();
		 System.out.println("State: " + t1.getState());
		//t2.sleep(1);
		t2.start();
		//t2.join();//one thread wait until another thread finishes execution.
		//t3.sleep(1);
		t3.start();
		
	}

}
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		
	}
	
}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=6;i<=10;i++) {
			System.out.print(i+" ");
		}
		
	}
}
class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.print(i+" ");
		}
		
	}
}
class Runnable1 implements Runnable{

	@Override
	public void run() {
		for(char i='A';i<='E';i++) {
			System.out.print(i+" ");
		}
		
	}
	
}
