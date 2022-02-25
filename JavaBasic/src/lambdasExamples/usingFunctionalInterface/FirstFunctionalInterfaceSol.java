package lambdasExamples.usingFunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lambdasExamples.Person;

public class FirstFunctionalInterfaceSol {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		Collections.sort(people, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		printAll(people);
		
		performConditionallyP(people, p -> p.getFirstName().startsWith("C"),p-> System.out.println(p));
		performConditionallyP(people, p -> p.getLastName().startsWith("C"),p -> System.out.println(p.getFirstName()));

	}
	public static void performConditionallyP(List<Person> p,Predicate<Person> predicate,Consumer<Person> consumer)
	{
		for(Person person:p)
		{
			if(predicate.test(person))
			{
				consumer.accept(person);
			}
			
		}
	}
	
	public static void printAll(List<Person> p)
	{
		for(Person s:p)
		{
			System.out.println(s);
		}
	}
}
