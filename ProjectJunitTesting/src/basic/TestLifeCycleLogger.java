package basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger {
	@BeforeAll
	default void beforeAll()
	{
		System.out.println("Before All");
	}
	@BeforeEach
	default void beforeEach()
	{
		System.out.println("Before Each");
	}
	@AfterEach
	default void AfterEach()
	{
		System.out.println("After Each");
	}
	@AfterAll
	default void AfterAll()
	{
		System.out.println("After All");
	}
}
