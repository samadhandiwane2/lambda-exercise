package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;

import io.javabrains.common.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Jurgen", "Klopp", 60),
				new Person("Bruno", "Fernandes", 25),
				new Person("Steven", "Bergwin", 22),
				new Person("Mo", "Salah", 26)
			);
		
		System.out.println("Using for loop");
		for(int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for each loop");
		for(Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("Using lambda for each loop");
		people.forEach(System.out::println);

	}

}
