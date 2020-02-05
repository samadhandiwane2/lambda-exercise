package io.javabrains.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.common.Person;

public class StandardFunctionalInterfacesExample {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Jurgen", "Klopp", 60),
				new Person("Bruno", "Fernandes", 25),
				new Person("Steven", "Bergwin", 22),
				new Person("Mo", "Salah", 26)
			);
		
		/* 1. Sort list by last name */
		
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		/* 2. Create a method that prints all elements in the list */
		System.out.println("Printing All Persons");
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		/* 3. Create a method that prints all people that have last name beginning with K */
		System.out.println("Printing persons Last name starts with K");
		performConditionally(people, p -> p.getLastName().startsWith("K"), p -> System.out.println(p));
		
		
		System.out.println("Printing persons First name starts with M");
		performConditionally(people, p -> p.getFirstName().startsWith("M"), p -> System.out.println(p.getFirstName()));

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}			
		}		
	}

}
