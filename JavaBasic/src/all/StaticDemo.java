package all;
public class StaticDemo {
	int a=10;
	int b;
	static int c=25;
	void func1()
	{
		System.out.println("The values are");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("c value is "+c);
	}
	
	static void func2()
	{
		int d=19;
		System.out.println("d value is "+d);
		System.out.println("c value is "+c);
	}
	
	static
	{
		System.out.println("Hi I am in static block");
//		System.exit(0); this we stop the execution of program.
	}
	
	static
	{
		System.out.println("Hi i am static block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("c value is "+StaticDemo.c);
		StaticDemo obj=new StaticDemo();
		obj.func1();
		StaticDemo.func2();
	}

}
