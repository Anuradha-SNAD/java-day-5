package org.snad.queue;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
//		Animal animal = new Animal() {//anonymous class
//			public void sound() {
//				System.out.println("Boww Bowww...");
//			}
//		};
//		animal.sound();
//		System.out.println("===without anonymous===");
//		Demo demo = new Demo();
//		demo.sound();
		
		System.out.println("==== Using Lamda Expression ====");
		Animal animal = ()->{
			System.out.println("Bow Bow...using Lamda");
		};
		animal.sound();
	}

}
	@FunctionalInterface
	interface Animal{
		void sound();
	}
//	class Demo implements Animal{
//	
//		@Override
//		public void sound() {
//			System.out.println("Boww Boww...");
//		}
//		
//	}