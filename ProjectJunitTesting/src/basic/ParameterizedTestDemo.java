package basic;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings= {"1","2","3"})
	void withValueSource(String number)
	{
		assertNotNull(number);
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"1","2","3","Four","Five"})  
	//here string are converted into int
	void withValueSource(Integer number)
	{
		assertNotNull(number);
	}
}
