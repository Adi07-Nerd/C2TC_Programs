package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();
		   //Creating HashMap 
		 //gives element in random order
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   map.put(null, null);
		   map.put(null, "berry");
		   map.put(5, null);
		       
		   System.out.println("Iterating Hashmap...");  
		   
		   
		   for(Map.Entry m : map.entrySet())
		    System.out.println(m.getKey()+" "+m.getValue());    
	}

}
