package generics;

public class GenericMethodTest {

	public <E> void displayArrayElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println("Element is "+element);
		}
	}
	public static void main(String[] args) {
		GenericMethodTest genericMethodTest = new GenericMethodTest();
		Integer[] intarray= {10,20,30,40};
		String[] str= {"Java","programming","learning"};
		genericMethodTest.displayArrayElements(intarray);
		genericMethodTest.displayArrayElements(str);

	}

}
