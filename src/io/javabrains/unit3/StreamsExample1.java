package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.common.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Jurgen", "Klopp", 60),
				new Person("Bruno", "Fernandes", 25),
				new Person("Steven", "Bergwin", 22),
				new Person("Mohammed", "Salah", 26)
			);
		
		people.stream()
			.filter(p -> p.getLastName().startsWith("F"))
			.forEach(p -> System.out.println(p.getFirstName()));

	}

}
