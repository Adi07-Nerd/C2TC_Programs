package lambdasExamples;

public class RunnableExampleWithLambda {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable.");
				
			}
		});
		
		thread.run();
		
		Thread thread2 = new Thread(()-> System.out.println("Printed inside lambda Runnable"));
		thread2.run();

	}

}
