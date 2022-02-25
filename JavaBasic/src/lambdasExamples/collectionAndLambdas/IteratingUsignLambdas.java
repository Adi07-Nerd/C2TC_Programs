package lambdasExamples.collectionAndLambdas;

import java.util.Arrays;
import java.util.List;

import lambdasExamples.Person;

public class IteratingUsignLambdas {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		//using for loop external iterator
//		for(int i=0;i<people.size();i++)
//			System.out.println(people.get(i));
		
		// using for-in loop external iterator
//		for (Person person : people) {
//			System.out.println(person);
//		}
		
		System.out.println("Using lambdas also called as internal iterator" );
		//p-> System.out.println(p) it will also provide same functionality
		people.forEach(System.out::println); //using method reference
	}

}






















