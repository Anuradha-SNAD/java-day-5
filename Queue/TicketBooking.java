package org.snad.queue;

import java.util.*;

public class TicketBooking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue<String> queue = new LinkedList<>();
		
        while(true) {
        	System.out.println();
            System.out.println("1.Add Customer 2.Book Ticket 3.Display");
            int choice = s.nextInt();
            switch(choice) {
            case 1 :{
            	queue.add(s.next());
            	System.out.println("added");
            	break;
            }
            case 2 :{
            	if(queue.isEmpty()) {
                    System.out.println("No customers in queue,Add customer to book");
                } else {
                    System.out.println("Ticket Booked for: " + queue.poll());
                }
            	break;
            }
            case 4 : {
            	System.out.println(queue);
            	break;
            }
            default : {
            	System.out.println("Invalid..!! Choose correct one");
            }
            }
        }
	}

}
