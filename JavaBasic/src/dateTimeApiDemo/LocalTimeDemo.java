package dateTimeApiDemo;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime localTime=LocalTime.now();
		System.out.println("Current Time: "+localTime);
		
		LocalTime localTime1=LocalTime.parse("09:56");
		System.out.println("Current Time: "+localTime1);
		
		LocalTime t=LocalTime.of(7, 4);
		System.out.println(t);
		
		System.out.println("add 10 hours: " + t.plusHours(10));
		
		System.out.println("Minumum Time: "+localTime.MAX);
		System.out.println("Maximum Time: "+localTime.MIN);
	}

}
