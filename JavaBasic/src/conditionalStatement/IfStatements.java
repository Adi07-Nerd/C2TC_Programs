package conditionalStatement;

public class IfStatements {

	public static void main(String[] args) {
		int a=10,b=9,c=12;
		//if  there is only single sentance than using braces is optional	
		 //Simple if
		if(true)
			System.out.println("Hey it;s me without brackets");
		
		// If Else
		if(a>b)
			System.out.println("Greatest: "+a);
		else
			System.out.println("Greatest: "+b);
		
		//If Else If ladder
		if(a>b && a>c)
			System.out.println("A is greatest.");
		else if(b>a && b>c)
			System.out.println("B is greatest");
		else
			System.out.println("C is greatest");
		
		//Nested else if
		if(a>b)
			if(a>c)
				System.out.println("A is greatest");
			else
				System.out.println("C is greatest");
		else
			if(b>c)
				System.out.println("B is greatest");
			else
				System.out.println("C is greatest");
		
		// ternary operator
		System.out.println("Greatest "+((a>b)?(a>c)?a:c:(b>c)?b:c));
		
		
	}
}
