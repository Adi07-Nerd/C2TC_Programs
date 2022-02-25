package lambdasExamples.collectionAndLambdas;

import java.util.Arrays;
import java.util.List;

import lambdasExamples.Person;

public class StreamsUsingLambdas {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		people.stream()
		.filter(p-> p.getLastName().startsWith("C"))         //1st check if its true element pass to next stage otherwise it neglected
		.forEach(p->System.out.println(p.getLastName()));
		
		// it contains Collection process and a terminating process
		long count = people.stream()
		.filter(p->p.getLastName().startsWith("C"))
		.count();
		
		// if you have alot of processing than use paralleStream()
		System.out.println(count);
	}

}
