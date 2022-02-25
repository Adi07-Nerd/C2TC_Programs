package threading;
class User
{
	int speed;
	String name;
	
	public User(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	private void fillingForm(int i)
	{
		try
		{
			Thread.sleep(this.speed*1000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Name:"+this.name+" Done filling form No." + i);
	}
	
	public void TotalForm() {
		for(int i=0;i<3;i++)
			this.fillingForm(i+1);
	}
}
class FillingForm extends Thread
{
	User user;
	public FillingForm(User s) {
		this.user=s;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.user.TotalForm();
	}
	
}
public class MyThreadingDemo {

	public static void main(String[] args) {
		User u1=new User(2, "Bala");
		User u2=new User(2, "Vishal");
		User u3=new User(4, "Aditya");
		
		long start=System.nanoTime();
		u1.TotalForm();
		u2.TotalForm();
		u3.TotalForm();
		
		
//		FillingForm t1=new FillingForm(u1);
//		FillingForm t2=new FillingForm(u2);
//		FillingForm t3=new FillingForm(u3);
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		try
//		{
//			t1.join();
//			t2.join();
//			t3.join();
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
		
		long end=System.nanoTime();
		long sec=(end-start)/1000000000;
		System.out.println("Execution Time: "+sec+" seconds");
		

	}

}
