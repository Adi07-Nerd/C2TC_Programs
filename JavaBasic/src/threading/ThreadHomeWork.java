package threading;
class Printing extends Thread
{
	char[] name;

	public Printing(String name) {
		this.name=name.toCharArray();
	}

	@Override
	public void run() {
		System.out.println("Hello Myself ");
		for(int i=0;i<this.name.length;i++)
		{
			try
			{
				Thread.sleep(377);
			}catch(Exception e)
			{
				
			}
			System.out.print(this.name[i]);
		}
		System.out.println();
	}
	
	
	
}
public class ThreadHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printing a=new Printing("Aditya Yadav");
		a.start();
		try
		{
			a.join();
		}catch(Exception e)
		{
			
		}
		System.out.println("Thank you.");

	}

}
