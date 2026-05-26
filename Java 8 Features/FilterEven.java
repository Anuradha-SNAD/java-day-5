package org.snad.queue;

import java.util.ArrayList;
import java.util.List;

public class FilterEven {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(4);
		list.add(7);
		list.add(9);
		list.add(1);
		list.add(5);
		System.out.println("Even Numbers using stream");
		list.stream().filter(n-> n % 2 == 0).forEach(System.out::println);
		System.out.println("Odd Numbers using stream");
		list.stream().filter(n-> n % 2 != 0).forEach(System.out::println);
	
	}

}
