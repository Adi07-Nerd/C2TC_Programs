package collectionDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Student2
{
	int id;
	String name;
	int grade;
	
	public Student2(int id,String name,int grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	public String toString()
	{
		return "Student is ["+this.id+","+this.name+","+this.grade+"]";
	}
}
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		Student2 s1=new Student2(101,"Harry Potter",10);
		Student2 s2=new Student2(102,"Ronald Weisley",12);
		v.addElement(s2);
		v.addElement(s1);
		v.addElement("999");;
		v.addElement("999");;
		v.addElement(new String("999"));
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}
		
	}

}
