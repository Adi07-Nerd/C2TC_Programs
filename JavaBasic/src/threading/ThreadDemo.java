package threading;

class Ex extends Thread {
	int st;
	String msg;
	
	public Ex( String msg,int st) {
		this.st = st;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(st);
			}
			catch(Exception e)
			{
				
			}
		System.out.println(msg + i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex thread1 = new Ex("First", 2000);
		Ex thread2 = new Ex("Second", 4000);

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}

		catch (Exception e) {

		}

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			System.out.println("main" + i);
		}
	}

}
