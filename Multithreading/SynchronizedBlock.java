package org.snad.multithreading;

public class SynchronizedBlock {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		MyThread5 t1 = new MyThread5(c);
		MyThread5 t2 = new MyThread5(c);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Final Count: " + c.count);
		
	}

}
class MyThread5 extends Thread{
	Counter counter;
	MyThread5(Counter counter){
		this.counter = counter;
	}
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
            counter.increment();
        }	
	}
}
class Counter{
	int count = 0;
	public void increment() {
		count++;
	}
}
