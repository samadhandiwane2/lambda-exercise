package io.javabrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.javabrains.common.Person;

public class Unit1ExerciseSollutionJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Jurgen", "Klopp", 60),
				new Person("Bruno", "Fernandes", 25),
				new Person("Steven", "Bergwin", 22),
				new Person("Mo", "Salah", 26)
			);
		
		/* 1. Sort list by last name */
		
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		/* 2. Create a method that prints all elements in the list */
		System.out.println("Printing All Persons");
		printAll(people);
		
		/* 3. Create a method that prints all people that have last name beginning with K */
		System.out.println("Printing persons Last name starts with K");
		printLastNameBeginningWithK(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("K");
			}			
		});
		
		
		System.out.println("Printing persons First name starts with M");
		printLastNameBeginningWithK(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("M");
			}			
		});

	}

	private static void printLastNameBeginningWithK(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}			
		}		
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}		
	}

}

interface Condition {
	boolean test(Person p);
}
