package io.javabrains.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.common.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Jurgen", "Klopp", 60),
				new Person("Bruno", "Fernandes", 25),
				new Person("Steven", "Bergwin", 22),
				new Person("Mo", "Salah", 26)
			);
		
		
		System.out.println("Printing All Persons");
		performConditionally(people, p -> true, System.out::println);  // this is similar to p -> method(p)
		

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}			
		}		
	}
}
