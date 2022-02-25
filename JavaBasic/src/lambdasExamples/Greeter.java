package lambdasExamples;

public class Greeter {
	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		// by using Different class
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		
		//by using lambda
		Greeting myLambda=() -> System.out.println("Hello World");
		
		//by using Anonymous innerclass
		Greeting anonymousClass = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World.");
				
			}
		};
		
		
		helloWorldGreeting.perform();
		
		myLambda.perform();
		
		greeter.greet(helloWorldGreeting);
		
		greeter.greet(anonymousClass);
		greeter.greet(myLambda);
	}

}