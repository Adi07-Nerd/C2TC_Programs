package generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedCardDemo {
	public static void displayNumber(List<? super Integer> list)
	{
		for(Object b:list)
		{
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3);
		System.out.println("display values.");
		displayNumber(l1);
		
		List<Number> asList = Arrays.asList(1.0,2.0,3.0);
		System.out.println("display values.");
		displayNumber(asList);
		
		List<Double> asList2 = Arrays.asList(1.3,2.4,1.4); //-> wont work
		List<String> asList1 = Arrays.asList("Hi","Hello","How are you"); //won't work
		
	}

}
