package dateTimeApiDemo;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		Clock clock=Clock.systemDefaultZone();
		LocalDate localDate2=LocalDate.now(clock);
		System.out.println(localDate2);
//		
		ZoneId zone=ZoneId.of("Africa/Addis_Ababa");
		LocalDate localDate3=LocalDate.now(zone);
		System.out.println(localDate3);
//		
//		System.out.println("-----------------");
//		
		LocalDate localDate4=LocalDate.of(2001, 07, 04);
//		System.out.println(localDate4);
//		
		LocalDate localDate5=LocalDate.parse("2016-07-09");
//		
		System.out.println("Adding 56 days in current date time: "+localDate5.plusDays(56));
		System.out.println("Adding 2 Month in current date time: "+localDate5.plusMonths(3));
		System.out.println("Subtracting 5 days in current date time: "+localDate2.minusDays(5));
//		
//		System.out.println("------------- Other Functions ---------------");
//		DayOfWeek  dayOfWeek=localDate2.getDayOfWeek();
//		System.out.println("Day of Week: "+dayOfWeek);
//		
//		System.out.println(localDate2.getYear()+" is a leap year? "+localDate2.isLeapYear());
		System.out.println(localDate4.getYear()+" is a leap year? "+localDate4.isLeapYear());
		System.out.println(localDate5.getYear()+" is a leap year? "+localDate5.isLeapYear());
		System.out.println(localDate5.getDayOfWeek());
		
		System.out.println(LocalDate.now().getDayOfWeek());
		
	}

}
