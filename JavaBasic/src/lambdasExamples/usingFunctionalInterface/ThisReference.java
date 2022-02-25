package lambdasExamples.usingFunctionalInterface;

public class ThisReference {
	public void doProcess(int i,Process p)
	{
		System.out.println(this);
		p.process(i);
	}
	public static void main(String[] args) {
		ThisReference reference = new ThisReference();
		reference.doProcess(10, i-> {
			System.out.println();
			//System.out.println(this); //this will thrown an error if you call outside the static it will refer to the method it called.
		});
		
		reference.doProcess(10, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i);
				System.out.println(this);
				
			}
			
			public String toString()
			{
				return "This is inner class";
			}
		});

	}
	
	public String toString()
	{
		return "THis is main class";
	}

}
