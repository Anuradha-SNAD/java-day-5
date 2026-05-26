package org.snad.multithreading;

public class PriorityThread {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Low");
        MyThread2 t2 = new MyThread2("Normal");
        MyThread3 t3 = new MyThread3("High");
        
        t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()
	                + " Priority:   "
	                + Thread.currentThread().getPriority()
	                + "==> Value: " + i);
		}
	}
	
}
class MyThread2 extends Thread{
	
	public MyThread2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=6;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()
	                + "Priority: "
	                + Thread.currentThread().getPriority()
	                + "==> Value: " + i);
		}
	}
	
}
class MyThread3 extends Thread{
	
	public MyThread3(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(Thread.currentThread().getName()
	                + " Priority: "
	                + Thread.currentThread().getPriority()
	                + "==> Value: " + i);
		}
	}
	
}
