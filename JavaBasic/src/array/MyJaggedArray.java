package array;
import all.Bicycle;
import all.InheritenceDemo;
public class MyJaggedArray {

	public static void main(String[] args) {
		//ask for different types of data
		String[] names=new String[] {"Bicycle","MoutainBike","ElectricBike"};
		
		Bicycle vehicles[][]=new Bicycle[3][]; //initiating with parent class 
		
		vehicles[0]=new Bicycle[4];
		vehicles[0][0]=new Bicycle(3, 31);
		vehicles[0][1]=new Bicycle(4, 43);
		vehicles[0][2]=new Bicycle(2, 19);
		vehicles[0][3]=new Bicycle(1, 9);
		
		vehicles[1]=new Bicycle[3];
		vehicles[1][0]= InheritenceDemo.getMoutainBike(4, 60,12);
		vehicles[1][1]= InheritenceDemo.getMoutainBike(5, 77,10);
		vehicles[1][2]= InheritenceDemo.getMoutainBike(6, 92,9);
		
		vehicles[2]=new Bicycle[2];
		vehicles[2][0]=InheritenceDemo.getElectBicycle(9, 100, "Blooper");
		vehicles[2][1]=InheritenceDemo.getElectBicycle(12, 110, "StarLazer",5000,17000);
		
		getAvailableVehicle(vehicles,names); // to check available vehicles
		
		getDetails(vehicles[0]); //check details for bicycle
		getDetails(vehicles[1]); // check details for MotorBike
		getDetails(vehicles[2]); //check details for ElectricBike
	}
	
	static void getAvailableVehicle(Bicycle[][] b,String[] names)
	{
		System.out.println("Vehicle in stock");
		int total=0;
		for(int i=0; i<b.length ;i++)
		{
			System.out.print(names[i]+" : "+b[i].length+"\t");
			total+=b[i].length;
		}
		System.out.println("\nTotal: "+total);
	}
	
	static void getDetails(Bicycle[] b)
	{
		for (Bicycle vehicle : b) {
			System.out.print(vehicle+"\n");
		}
		System.out.println();
	}

}
