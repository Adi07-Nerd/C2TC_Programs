package dateTimeApiDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import javax.xml.crypto.Data;

public class DurationAndPeriodDemo {

	public static void main(String[] args) {
		//Period is used to deals with date
		
		LocalDate date=LocalDate.now();
		
		LocalDate addDate=date.plus(Period.ofDays(10));
		
		int days=Period.between(date, addDate).getDays();
		System.out.println(days);
		
		long between = ChronoUnit.DAYS.between(date, addDate);
		System.out.println(between);
		
		System.out.println("-----------------------------------");
		//Duration is used ot deals with time
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: "+currentTime);
		LocalTime addedTime = currentTime.plus(Duration.ofSeconds(30));
		System.out.println("Added Time: "+addedTime);
		long seconds = Duration.between(addedTime,currentTime).getSeconds();
		System.out.println(seconds);
		
		long seconds2 = ChronoUnit.SECONDS.between(addedTime, currentTime);
		System.out.println(seconds2);
		
		
		

	}

}
