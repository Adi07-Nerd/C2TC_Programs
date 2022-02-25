package generics;

interface MinMax<T extends Comparable<T>>
{
	T min();
	T max();
}

public class GenericInterfaceDemo<T extends Comparable<T>> implements  MinMax<T>{

	T[] values;
	public GenericInterfaceDemo(T[] values) {
			this.values = values;
		}
	
	

	@Override
	public T min() {
		T o1=values[0];
		for(int i=1;i<values.length;i++)
		{
			if(values[i].compareTo(o1)<0)
				o1=values[i];
		}
		return o1;
	}



	@Override
	public T max() {
		T o1=values[0];
		for(int i=1;i<values.length;i++)
		{
			if(values[i].compareTo(o1)>0)
				o1=values[i];
		}
		return o1;
	}



	public static void main(String[] args) {
		Integer arr[]= {3,6,2,8,6};
		
		GenericInterfaceDemo<Integer> ob1 = new GenericInterfaceDemo<Integer>(arr);
		
		System.out.println("Minimum value is: "+ob1.min());
		System.out.println("Minimum value is: "+ob1.max());

	}

}
