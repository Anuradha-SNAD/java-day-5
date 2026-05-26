package org.snad.queue;

@FunctionalInterface
interface Demo{
	//void show();
	//void square(int n);
	//void sum(int a, int b);
	void greet(String name);
}


public class LambdaDemo {
	public static void main(String[] args) {
		
//		System.out.println("=== No Parameters ===");
//		Demo d = () -> {
//			System.out.println("Hello...");
//		};
//		d.show();
		
//		Demo demo = (int a)->{
//			System.out.println("square = "+a*a);
//		};
//		demo.square(6);
		
//		Demo d =(int a ,int b)->{
//			System.out.println("sum = "+(a+b));
//		};
//		d.sum(10 , 80);
		
		Demo d = (String name)->{
			System.out.println("Hello "+name);
		};
		d.greet("Anu");
	}

}
