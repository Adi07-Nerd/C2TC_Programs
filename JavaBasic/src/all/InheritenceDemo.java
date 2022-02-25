package all;
import all.Bicycle;
//making bicycle class of this package as public so have implement in separate file

class MountainBike extends Bicycle
{
    int seatHeight;
    
	public MountainBike(int gear, int speed,int seatHeight) {
		super(gear, speed);
		this.seatHeight=seatHeight;
	}
		
   void	adjustHeight(int value)
	{
	   seatHeight=value;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}

	
}

class ElectricBike extends Bicycle{
	String name;
	int currentSpeed=0;
	int chargeStatus=0,batteryCapacity=0;
	boolean isCharging,isActive;
	float price=0;
	
	public ElectricBike(int gear, int speed,String name) {
		super(gear, speed);
		this.name=name;
	}
	
	public ElectricBike(int gear, int speed,String name, int batteryCapacity, float price) {
		super(gear, speed);
		this.name=name;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}
	
	public void startUp() {
		if(!this.isCharging) {
			boolean res=(this.chargeStatus >= (int)(this.batteryCapacity*0.10))? true:false;
			if(res) {
				this.isActive=true;
				this.currentSpeed=5;
			}
			else {
				System.out.println("you don't have enough charge.");
			}
		}
		else
		{
			System.out.println("You can't start bike while charging.");
		}
	}
	
	@Override
	public void speedUp(int increment) {
		if(this.isActive) {
			if(this.currentSpeed>this.speed) {
				this.currentSpeed+=1;
			}
			else
			{
				System.out.println("You reached Maximum speed.");
			}
		}
		else {
			this.currentSpeed+=increment;
		}
	}
	
	@Override
	void applyBreak(int decrement) {
		if(this.isActive) {
			this.currentSpeed-=1;
			if(this.currentSpeed<=0){
				this.isActive=false;
			}
		}
		else
		{
			this.currentSpeed-=decrement;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nName:"+this.name+"(ElectricBike)\nBattery Capacity:"+this.batteryCapacity+"\tSpeed:"+this.speed+"\tGear:"+this.gear+"\nPrice:"+this.price;
	}
	
}

public class InheritenceDemo {

	public static void main(String[] args) {
		 MountainBike bike= new MountainBike(5,160,10);
		   bike.speedUp(10);
		   bike.applyBreak(5);
		   //bike.adjustHeight(4);
		   System.out.println(bike.toString());
		   
		   ElectricBike e1=new ElectricBike(4, 90, "Bala");
		   e1.chargeStatus=e1.batteryCapacity;
		   e1.startUp();
		   e1.speedUp(5);
		   e1.applyBreak(5);
		   System.out.println(e1);
		   
	}
	
	public static Bicycle getMoutainBike(int gear,int speed,int seatHeight)
	{
		return new MountainBike(gear,speed,seatHeight);
	}
	
	public static Bicycle getElectBicycle(int gear,int speed,String name)
	{
		return new ElectricBike(gear,speed,name);
	}
	
	public static Bicycle getElectBicycle(int gear,int speed,String name,int batteryCapacity,float price)
	{
		return new ElectricBike(gear,speed,name,batteryCapacity,price);
	}
	
}
