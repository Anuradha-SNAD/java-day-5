package org.snad.queue;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(10);
		System.out.println(queue);
		queue.offer(40);
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());//remove element from first FIFO
		System.out.println(queue);
		System.out.println(queue.size());
		
	}

}
