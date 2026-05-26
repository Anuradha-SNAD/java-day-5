package org.snad.queue;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your birth year : ");
		int year = sc.nextInt();
		
		System.out.println("enter your birth month : ");
		int month = sc.nextInt();
		
		System.out.println("enter your birth day : ");
		int day = sc.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		
		Period age = Period.between(date, today);
		System.out.println("Age : "+age.getYears()+"years "+age.getMonths()+"months "+age.getDays()+" days");
		
		
	}

}
