package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericExample1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("India");
		list.add("Pakistan");
		list.add("Russia");
		list.add("USA");
		list.add("Mexico");
		list.add("Ukraine");
		list.add("Britain");
		
		String country=list.get(0);
		System.out.println("Element is "+country);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
