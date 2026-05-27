package org.snad.multithreading;

class Restaurant{
	String food;
	boolean avalaible = false;
	
	public synchronized  void prepareFood(String item)   {
		while(avalaible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		food = item;
		System.out.println("Prepared : "+ food);
		avalaible = true;
		notify();
	}
	public synchronized  void parcel() {
		while(!avalaible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Customer Ordered "+food);
		avalaible =  false ;
		notify();
	}
	
}

class Order extends Thread{
	Restaurant restaurant;
	
	Order(Restaurant r){
		this.restaurant = r ;
	}
	@Override
	public void run() {
		String items [] = {"Dosa","idly","biryani","chicken"};

		for(String s : items) {
			restaurant.prepareFood(s);
		}
	}
	
}
class Customer1 extends Thread{
	Restaurant restaurant;
	
	Customer1(Restaurant r){
		this.restaurant = r;
	}
	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			restaurant.parcel();
		}
	}
}

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		
		Order order = new Order(r);
		Customer1 customer = new Customer1(r);
		
		order.start();
		customer.start();
		
	}

}
