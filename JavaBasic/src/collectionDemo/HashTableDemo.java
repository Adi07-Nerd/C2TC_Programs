package collectionDemo;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import collectionDemo.Student2;
public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht1=new Hashtable<Integer, String>(5);
		ht1.put(1,"One");
		ht1.put(2,"Two");
		ht1.put(3,"Three");
		ht1.put(4,"Four");
		ht1.put(5,"Five");
		ht1.put(6,"Six");
//		ht1.put(null,null);
//		ht1.put(7,null);
//		ht1.put(1,null);
//		ht1.put("1","Some");data of key value should be matched with initialized variable key value
		
		System.out.println("Printing 1st table");
		printing(ht1);
		
		Hashtable ht2=new Hashtable(ht1);
		ht2.put(1,"Again");
		ht2.put("Hello", "value");
		ht2.put("Hello","Again");
		ht2.remove(1);
		
		System.out.println("Printing 2st table");
		printing(ht2);
		Hashtable<Integer,Student2> ht3=new Hashtable<Integer, Student2>();
		ht3.put(1,new Student2(18, "Bala", 1));
		ht3.put(2,new Student2(18, "Bala", 2));
		ht3.put(2,new Student2(18, "Bala", 2));
		
		ht3.replace(1, new Student2(18, "Ankit", 1));
		
		System.out.println("Printing 3st table");
		printing(ht3);
		
	}
	
	public static void printing(Hashtable h)
	{
		Set<Map.Entry> m=h.entrySet();
		for(Map.Entry entries:m)
		{
			System.out.println(entries.getKey()+" "+entries.getValue());
		}
	}

}
