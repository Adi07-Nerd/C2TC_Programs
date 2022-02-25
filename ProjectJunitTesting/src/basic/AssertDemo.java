package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
//@Disabled // it'll disabled whole class
public class AssertDemo {
	@Test // this annotation is not apply to class because its unit testing belongs to method
	public void simple1()
	{
		int result=1;
		int expected=1;
		assertEquals(result, expected);
	}
	@Test
	public void simple2()
	{
		int result=1;
		int expected=2;
		assertEquals(result, expected);
	}
	@Disabled // it's used to not apply test on that method
	@Test
	public void simple3()
	{
		int result=1;
		int expected=3;
		assertEquals(result, expected);
	}
}
