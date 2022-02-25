package all;

public class Bicycle {
	int gear;
	int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	
	void speedUp(int increment )
	{
		speed+=increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
}
