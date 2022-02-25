package conditionalStatement;

public class LoopingStatement {

	public static void main(String[] args) {
		String[] fruits= {"Apple","Orange","Banana","Mango"};
		//for loop
		System.out.println("For loop");
		for(int i=0;i<5;i++)
		{
			System.out.println("Iteration "+i);
		}
		
		//Enhance for loop it is used for traversing through array or collections.
		System.out.println("Enhance For loop");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//while
		System.out.println("While");
		int i=0;
		while(i<3)
		{
			System.out.println("Iteration "+i);
			i++;
		}
		i=0;
		//do while difference between this and while is , this atleast execute one time either condition satisfy or not.
		System.out.println("Do While");
		do
		{
			System.out.println("Iteration "+i);
			i++;
		}while(i<0);
		
		//jump statements
		//break to terminate the execution of loop
		System.out.println("using Break");
		
		for(int a=0;a<5;a++)
		{
			if(a==2) {
				System.out.println("Premature exit.");
				break;				
			}
			System.out.println("Iteration "+a);
		}
		
		//continue to skip certain iteration
		System.out.println("using Continue");
		for(int a=0;a<5;a++)
		{
			if(a==2)
				continue;
			System.out.println("Iteration "+a);
		}
		
	}
	
}
