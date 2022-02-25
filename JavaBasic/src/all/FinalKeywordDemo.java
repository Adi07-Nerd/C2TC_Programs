package all;
class Car
{
	final int max_speed=120;
	void controlSpeed()
	{
//		max_speed=180; this will generate an error you can't change value of final stated variables.
		System.out.println("Max speed value is"+max_speed);
	}
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.controlSpeed();
	}

}
