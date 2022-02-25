package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList da=new LinkedList();
		da.add("Hermione Granger");
		da.add("Neville Longbottom");
		da.add("Luna Lovegood");
		da.add("Harry Potter");
		da.add("Ronald Weisley");
		da.add("Bellatrix lastrange");
		da.add(1455);
		
		System.out.println("Removing last element: "+da.removeLast());
		System.out.println("Accessign First Element: "+da.getFirst());
		
		LinkedList<String> marauders=new LinkedList<String>();
		marauders.add(0,"Serious Black");
		marauders.add(1,"James Potter");
		marauders.add(2,"Petter pettigrew(Traitor)");
		marauders.add(3,"professor Lupin");
		
		String[] otherCharacter=new String[] {"Lord Voldemort","Severus Snape","Lily Potter","Albus wulfric brian dumbledore"};
		
		LinkedList impCharacter=new LinkedList(marauders);
		impCharacter.add(otherCharacter);
		impCharacter.add(0,"Draco Malfoy");
		
		System.out.println("Dumbledore's Army");
		Iterator i=da.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		System.out.println();
		System.out.println("Important Character");
		for (Object object : impCharacter) {
			if(object.getClass()==(otherCharacter.getClass()))
			{
				//for array inside collection
				for (String s : otherCharacter) {
					System.out.println(s);
				}
			}
			else
				System.out.println(object);
		}
		
		
	}

}
