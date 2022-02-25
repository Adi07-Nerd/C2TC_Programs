package lambdasExamples;

public class TypeInferenceExample {
	//here compiling automatically inferring lot of things like data types return type , method to choose from interface.
	public static void main(String[] args) {
		StringLength myLambda= s -> s.length();
		
		System.out.println(myLambda.getLength("Hello it's me"));
		
		printLambda(myLambda);

	}
	
	public static void printLambda(StringLength st) {
		System.out.println(st.getLength("Hello it's me"));
	}

}
interface StringLength{
	int getLength(String s);
}
