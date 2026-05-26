package org.snad.queue;

import java.util.Optional;
import java.util.Scanner;

public class UserSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Optional<String> user = findUser(sc.nextInt());
		if(user.isPresent()) {
			System.out.println(user.get());
		}else {
            System.out.println("User Not Found");
        }
		
	}

	public static Optional<String> findUser(int id) {
		if(id == 101) {
			return Optional.of("sai");
		}
		return Optional.empty();
	}

}
