package basic;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testOnDev()
	{
		String s1="ENV";
		String s2="DEV";
		System.setProperty(s1, s2);
		Assumptions.assumeTrue(s2.equalsIgnoreCase(System.getProperty(s1)));
	}
	
	@Test
	void testOnProd()
	{
		String s1="ENV";
		String s2="Prod";
		System.setProperty(s1, s2);
		Assumptions.assumeTrue("DEV".equalsIgnoreCase(System.getProperty(s1)));
	}
	
	@Test
	void testOnProd2()
	{
		String s1="ENV";
		String s2="Prod";
		System.setProperty(s1, s2);
		Assumptions.assumeFalse("DEV".equalsIgnoreCase(System.getProperty(s1)),AssumptionDemo::message);
	}
	@Test
	void testOnProd3()
	{
		String s1="ENV";
		String s2="Prod";
		System.setProperty(s1, s2);
		Assumptions.assumingThat("DEV".equalsIgnoreCase(System.getProperty(s1)),AssumptionDemo::message);
	}
	
	private static String message()
	{
		return "Execution failed ::";
	}
}
