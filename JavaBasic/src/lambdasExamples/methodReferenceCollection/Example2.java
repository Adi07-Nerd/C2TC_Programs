package lambdasExamples.methodReferenceCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import lambdasExamples.Person;

public class Example2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
//		System.out.println(people);
	
//		printAll(people);
		
		performConditionallyP(people,p->true, System.out::println);
		

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

interface Condition
{

	boolean test(Person person);
	
}
