package collectionDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		//homework
		lhs.add("Goku");
		lhs.add("Vegeta");
		lhs.add("Krilin");
		lhs.add("Master Roshi.");
	
		System.out.println("Capacity of first list: "+lhs.size());
		System.out.println("Master Roshi is removed from set: "+lhs.remove("Master Roshi"));
		
		LinkedHashSet child=new LinkedHashSet(3);
		child.add("Gohan");
		child.add("Goten");
		child.add("Trunks");
		child.add("Pan");
		child.add("Bula");
		child.add("Vidal");
		child.add("Gohan"); //repeated value
		child.add(null);
		
		for(Object s:child)
		{
			System.out.println(s);
		}
		
		System.out.println("Retain all method: "+child.retainAll(lhs));
		//retain all meaning smajg
		for(Object a:lhs)
		{
			System.out.println(a);
		}
	}

}
