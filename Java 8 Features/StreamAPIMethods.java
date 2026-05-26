package org.snad.queue;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIMethods {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(20);
		list.add(10);
		//filter(condition)
		list.stream().filter(n->n>10).forEach(System.out::println);
		//map(transform each element)
		System.out.println("==== Squares of list ====");
		list.stream().map(n->n*n).forEach(System.out::println);
		//sort
		System.out.println("==== Sorting list ====");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("==== Reverse Sorting list ====");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		//distinct()
		System.out.println("=== unique list ===");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("=== count ===");
		System.out.println(list.stream().count());
		//collect(to store)
		List<Integer> res = list.stream().filter(n->n>=20).collect(Collectors.toList());
		System.out.println(res);
		//limit
		list.stream().limit(2);
		//skip
		list.stream().skip(2);
	}

}
