package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet<String>();
		hs.add("Hash");
		hs.add("Set");
		hs.add("Demo");
		hs.add("Demo");
		hs.add(123); 
		
		//Treeset doesn't allow heterogenous value
		TreeSet ts=new TreeSet();
		ts.add("Hash");
		ts.add("Set");
		ts.add("Demo");
		ts.add("Demo");
//		ts.add(123); this will throw an error
		
		System.out.println("HashSet Data");
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		
		System.out.println("TreeSet Data");
		Iterator t=ts.iterator();
		while(t.hasNext())
		{
			Object c=t.next();
			System.out.println(c);
		}

	}

}
