package generics;

class GenericTest<T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return this.obj;
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
		GenericTest<Integer> obj = new GenericTest<Integer>();
		obj.add(2);
		System.out.println(obj.get());
		
		GenericTest<String> obj1 = new GenericTest<String>();
		obj1.add("Hi");
		System.out.println(obj1.get());

	}

}
