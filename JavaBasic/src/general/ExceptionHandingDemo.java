package general;

public class ExceptionHandingDemo {

	public static void main(String[] args) {
		try
		{
			int data=100/0;
		}
		catch(ArithmeticException ar)
		{
			ar.printStackTrace();
//			System.out.println("Error:"+ar.getMessage());
		}
		System.out.println("Exception Handling Demo");
	}

}
