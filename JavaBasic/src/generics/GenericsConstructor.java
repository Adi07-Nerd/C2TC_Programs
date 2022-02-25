package generics;

public class GenericsConstructor {
	private double v;
	public <T extends Number>GenericsConstructor(T t)
	{
		v=t.doubleValue();
	}
	
	void show()
	{
		System.out.println("Value of v is: "+this.v);
	}
	public static void main(String[] args) {
		System.out.println("Number to double Conversion:");
		GenericsConstructor obj = new GenericsConstructor(10);
		obj.show();
		
		GenericsConstructor obj1 = new GenericsConstructor(135.8f);
		obj1.show();

	}

}
