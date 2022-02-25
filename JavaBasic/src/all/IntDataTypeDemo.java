package all;

public class IntDataTypeDemo {

	public static void main(String[] args) {
		byte maxByte=127;
		byte minByte=-128;
		System.out.println("Maxinum Btye value "+maxByte+" Mininum Btye value "+minByte);
		
		short maxShort=32767;
		short minShort=-32768;
		System.out.println("Maxinum Short value "+minShort+" Minimum Short value "+maxShort);
		
		int maxInt=2147483647;
		int minInt=-2147483648;
		System.out.println("Maximum integer value "+maxInt+" Minimum integer value "+minInt);
		
		long maxLong=9223372036854775807L;
		long minLong=-9223372036854775808L;
		System.out.println("Maxinum Long value "+maxLong+" Mininum Long value "+minLong);
		
		float f=3234.123456424533f;
		System.out.println(f+" Float Value");
		double d=3234.1234564245332d;
		System.out.println(d+" Double Value");
		
		System.out.println("ASCII Code Representation");
		char var='A'; //65 => A ASCII code.
		char var2=66;
		int a='A'; //this will return ascii value
		System.out.println(var);
		System.out.println(var2);
		System.out.println(a);
		
		System.out.println("Unicode represtation");
		char a1='\u20B9';
		System.out.println(a1);
		
		
	}

}
