package basic;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifeCycleLogger {
	@Test
	@RepeatedTest(10)
	void test()
	{
		System.out.println("First test case");
	}
	@Test
	void test2()
	{
		System.out.println("Second test case");
	}
}
