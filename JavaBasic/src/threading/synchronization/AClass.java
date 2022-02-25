package threading.synchronization;

public class AClass {
	int bal;
	synchronized void deposit(int amt)
	{
		System.out.println("Getting balance...");
		int newbal=getBalance();
		bal=newbal+amt;
		setBalance(bal);
	}
	int getBalance()
	{
		return Account.Balance;
	}
	void setBalance(int amt)
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		Account.Balance=amt;
	}
}
