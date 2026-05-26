package org.snad.queue;

import java.util.*;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(30);
		priorityQueue.add(10);
		priorityQueue.add(40);
		priorityQueue.add(5);
		priorityQueue.add(20);
		System.out.println(priorityQueue);
		priorityQueue.poll();
		System.out.println(priorityQueue);
		priorityQueue.remove();
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());//smallest view
		
		System.out.println("Reverse Order");
		
		Queue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());
		priorityQueue2.add(30);
		priorityQueue2.add(10);
		priorityQueue2.add(40);
		priorityQueue2.add(5);
		priorityQueue2.add(20);
		System.out.println(priorityQueue2);
		priorityQueue2.poll();
		System.out.println(priorityQueue2);
		priorityQueue2.remove();
		System.out.println(priorityQueue2);
		System.out.println(priorityQueue2.peek());
	}

}
