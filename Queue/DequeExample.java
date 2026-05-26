package org.snad.queue;

import java.util.*;

public class DequeExample {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.offer(20);
		queue.addLast(30);
		queue.addFirst(5);
		queue.addLast(25);
		queue.addFirst(10);
		System.out.println(queue);
		System.out.println("first : "+ queue.peekFirst());
		System.out.println("last : "+queue.peekLast());
		queue.poll();
		System.out.println(queue);
		queue.pollLast();
		System.out.println(queue);
		queue.pollFirst();
		System.out.println(queue);
	}

}
