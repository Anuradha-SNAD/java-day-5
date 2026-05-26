package org.snad.queue;

import java.util.Optional;

public class OptionalClassEx {
	public static void main(String[] args) {
		Optional<String> name = Optional.of("Anu");
		System.out.println(name.get());
		
		Optional<String> name3 = Optional.empty();
		System.out.println(name3);
		
		Optional<String> name2 = Optional.ofNullable("Anuu");
		System.out.println(name2.isPresent());
		
		Optional<String> optional = Optional.ofNullable(null);
		System.out.println(name.orElse("sai"));
		
		Optional<String> op = Optional.ofNullable("Radha");

		op.ifPresent(n -> System.out.println(n));
		
	}

}
