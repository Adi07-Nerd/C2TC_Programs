package threading;

public class ThreadingUsingRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A oa1=new A(10,1,"FIRST");
        A oa2=new A(5,0,"SECOND");
        B ob=new B("THIRD");
        
        Thread t1=new Thread(oa1);
        Thread t2=new Thread(oa2);
        Thread t3=new Thread(ob);
       
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
        t1.join();
        t2.join();
        t3.join();
        }
        catch(Exception e)
        {
        }
        System.out.println("HAVE  A NICE DAY"); 
	}

}
