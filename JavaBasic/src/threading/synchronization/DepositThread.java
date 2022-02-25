package threading.synchronization;

public class DepositThread extends Thread {
	AClass obj;
	int amt;
	
	public DepositThread(AClass obj, int amt) {	
		this.obj = obj;
		this.amt = amt;
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		obj.deposit(amt);
	}
}
