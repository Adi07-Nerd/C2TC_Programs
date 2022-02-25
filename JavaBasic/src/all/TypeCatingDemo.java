package all;

public class TypeCatingDemo {

	public static void main(String[] args) {
		//Widening or implicit typecasting.
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		double i3=ch;
		System.out.println(i3);
		
		char var1='\u00A7';
		int i4=var1;
		System.out.println(i4);
		
		//narrowing or explicit typecasting
		double f1=10.532d;
		long l=(int) f1;
		System.out.println(l);
		
		float f2=34.56f;
		int il=(int) f2;
		System.out.println(il);
		
		long l1=9223372036854775806L;
		int i2=(int)l1;
		System.out.println(i2);
		
		byte b1=90;
		char c1=(char) b1;
		System.out.println(c1);
		
		
		
	}

}
