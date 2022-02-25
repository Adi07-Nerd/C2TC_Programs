package all;

public class WrapperClassDemo {

	public static void main(String[] args) {
		//unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i;
		System.out.println(b);
		
		//autoboxing
		int a=100;
		Integer i1=a;
		System.out.println(i1);
		Character ch='a';
		char c=ch;
		System.out.println(c);
	}

}
