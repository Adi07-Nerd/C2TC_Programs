package general;

import java.util.Scanner;

public class ExceptionHandlingDemo3 {
	
	static void validate(int age)
	{
		if(age>=18)
			System.out.println("You're eligible for voting");
		else
			throw new ArithmeticException("You're not old enough to vote.");
	}
	
	public static void main(String[] args) {
		int a=20;
		int b=0;
		int p=23;

		int[] x=new int[4];
		
		try		
		{
			if(b==0)
				throw new ArithmeticException("This is arithmetic exception");
			else
				a=a/b;
			x[p]=10;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(Exception ae)
		{
			System.out.println(ae.getMessage());
		}
	}

}
