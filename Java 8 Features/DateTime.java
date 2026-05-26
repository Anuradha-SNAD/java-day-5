package org.snad.queue;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {
		System.out.println("=== Local Date ===");
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		
		System.out.println("=== Local Time ===");
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		System.out.println("=== Local DateTime ===");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		System.out.println("=== DateTimeFormatter ===");
		LocalDate d = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(d.format(f));
		
		System.out.println("=== Period ===");
		 LocalDate d1 = LocalDate.of(2003,4,20);
	     LocalDate d2 = LocalDate.now();
	     Period p = Period.between(d1, d2);
	     System.out.println(p);
	     
	     System.out.println("=== Duration ===");
	     LocalTime t1 = LocalTime.of(8,25);
	     LocalTime t2 = LocalTime.of(22,46);
	     Duration duration = Duration.between(t1,t2);
	     System.out.println(duration.toHours());
		
		
	}

}
