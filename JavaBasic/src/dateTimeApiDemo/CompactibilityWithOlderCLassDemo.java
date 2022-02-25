package dateTimeApiDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CompactibilityWithOlderCLassDemo {

	public static void main(String[] args) {
		Date date = new Date();
		
		LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(),ZoneId.systemDefault());
		System.out.println(localDateTime);
		
		
		LocalTime localTime = localDateTime.toLocalTime();
		System.out.println(localTime);
		
		LocalDate localDate = localDateTime.toLocalDate();
		System.out.println(localDate);
		
		Calendar calendar = Calendar.getInstance();
		LocalDateTime.ofInstant(calendar.toInstant(),ZoneId.systemDefault());
		
		

	}

}
