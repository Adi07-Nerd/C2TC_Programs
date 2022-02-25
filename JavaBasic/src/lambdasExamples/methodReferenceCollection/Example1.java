package lambdasExamples.methodReferenceCollection;

public class Example1 {

	public static void main(String[] args) {
		Thread t=new Thread(()-> printMessage());
		//Method reference
		Thread t1=new Thread(Example1::printMessage); // alternate syntax for above thing.
		t.start();
//		printMessage();
		

	}
	
	public static void printMessage()
	{
		System.out.println("Hello Mate");
	}

}
