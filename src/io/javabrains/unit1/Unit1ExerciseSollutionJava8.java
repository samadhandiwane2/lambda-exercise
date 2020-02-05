package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import io.javabrains.common.Person;

public class Unit1ExerciseSollutionJava8 {

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
		printConditionally(people, p -> true);
		
		/* 3. Create a method that prints all people that have last name beginning with K */
		System.out.println("Printing persons Last name starts with K");
		printConditionally(people, p -> p.getLastName().startsWith("K"));
		
		
		System.out.println("Printing persons First name starts with M");
		printConditionally(people, p -> p.getFirstName().startsWith("M"));

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}			
		}		
	}

}
