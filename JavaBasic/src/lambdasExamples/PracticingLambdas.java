package lambdasExamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PracticingLambdas {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// sort list by last name
		Collections.sort(people, (p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		System.out.println(people);
		
		
		
		
		printAll(people);
		
		printConditionallyC(people, p -> p.getLastName().startsWith("C"));
		
		printConditionallyC(people, p -> p.getFirstName().startsWith("C"));
		printConditionallyC(people, p -> p.getLastName().startsWith("C"));
		
		
		
		// my implementation  kinda not perfect
//		PersonsFunctions fn= list1 -> {
//			list1.sort(Comparator.comparing(Person::getLastName));
//			System.out.println(list1);;
//		};
//		
//		fn.perform(people);
//		
//		
//		
//		
//		// create a method that prints all elements in the list
//		fn= list1 -> System.out.println(list1);
//		fn.perform(people);
//		
//		
//		// create a methods that prints all people that have last name begining with c.
//		fn=list1 -> {
//			for(Person p:list1)
//			{
//				char[] lastName=p.getLastName().toCharArray();
//				if(lastName[0]=='C')
//					System.out.print(p+"\t");
//			}
//			System.out.println();
//		};
//		
//		fn.perform(people);
	}
	
	public static void printConditionallyC(List<Person> p,Condition condition)
	{
		for(Person person:p)
		{
			if(condition.test(person))
			{
				System.out.println(p);
			}
			
		}
	}
	public static void printConditionallyP(List<Person> p,Predicate<Person> predicate)
	{
		for(Person person:p)
		{
			if(predicate.test(person))
			{
				System.out.println(p);
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
	public boolean test(Person p);
}

interface PersonsFunctions
{
	public void perform(List<Person> p1);
}

