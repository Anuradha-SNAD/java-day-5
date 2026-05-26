package org.snad.queue;

import java.util.*;

public class EmployeeSalaryFilter {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee(2,"Anu",20000);
		Employee employee2 = new Employee(3,"Vara",5000);
		Employee employee3 = new Employee(1,"Shankar",50000);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		System.out.println("=== Sorted by id ===");
		list.stream().sorted((e1,e2)->e1.id - e2.id).forEach(System.out::println);
		System.out.println("=== Filter Salary ===");
		list.stream().filter(emp->emp.salary < 10000).forEach(System.out::println);
	}

}
class Employee{
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id = id ;
		this.name = name ;
		this.salary = salary ;
	}
	
	public String toString() {
		return "Employee[id = "+id+", name = "+name+", salary = "+salary+"]";
	}
}
