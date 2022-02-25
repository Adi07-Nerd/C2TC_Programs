package lambdasExamples.usingFunctionalInterface;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambdas {

	public static void main(String[] args) {
		int [] someNumber= {1,2,3,4};
		int key=2;
		
		process(someNumber,key,wrapperLambda((n,k)-> System.out.println(n/k)));

	}

	private static void process(int[] someNumber, int key,BiConsumer<Integer, Integer> biConsumer) {
		for(int i:someNumber)
			biConsumer.accept(i,key);
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer)
	{
		return(v,k)->{
			try
			{
				biConsumer.accept(v, k);
			}
			catch(Exception e){
				System.out.println("Exceptin caught in wrapper lambda");
			}
		};
	}

}
















