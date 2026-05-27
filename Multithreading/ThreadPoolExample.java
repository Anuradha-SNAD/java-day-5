package org.snad.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	int n;
	
	Task(int n){
		this.n = n;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" exucuting task "+n);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for(int c=1;c<=5;c++) {
			Task task = new Task(c);
			service.execute(task);
		}
		service.shutdown();
		
	}

}
