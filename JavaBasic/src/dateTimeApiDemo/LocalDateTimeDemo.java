package dateTimeApiDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime dateTime2=LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(dateTime2);
		
		LocalDateTime dateTime3=LocalDateTime.parse("2020-08-10T10:08:45");
		System.out.println(dateTime3);

	}

}
