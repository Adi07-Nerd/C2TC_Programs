package all;

public class DecisionMakingWithOperators {

	public static void main(String[] args) {
		notOperator();
		comparisonOperator();
		logicalOperator();
		ternaryOperatore();
		assignOperator();

	}
	
	static void notOperator()
	{
		int x=5;
		if(x!=5)
			System.out.println("Value of x is not 5");
		else
			System.out.println("Value of x is 5");
	}
	
	static void comparisonOperator()
	{
		int x=8,y=7;
		if(x>=y)
			System.out.println("True");
		else
			System.out.println("False");
	}
	
	static void logicalOperator()
	{
		int x=10,y=11;
		if(!(x<y)||(x==y))
			System.out.println("Condition is True");
		else
			System.out.println("Condition is False");
	}
	
	static void ternaryOperatore()
	{
		int x=10;
		x= (10==x?1:0);
		System.out.println(x);
	}
	
	static void assignOperator() {
		int x=4;
		x+=4;
		System.out.println(x);
		x-=5;
		x*=5;
		x/=4;
		x%=5;
		System.out.println(x);
	}
}
