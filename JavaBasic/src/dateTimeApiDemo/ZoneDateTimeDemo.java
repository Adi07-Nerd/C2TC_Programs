package dateTimeApiDemo;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeDemo {

	public static void main(String[] args) {
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		Set<String> availableZoneIds=ZoneId.getAvailableZoneIds();
		availableZoneIds.forEach(System.out::println);
		
		LocalDateTime localDateTime=LocalDateTime.now();
		//I dont get It how it convert time
		ZonedDateTime dateTime=ZonedDateTime.of(localDateTime,tokyo);
		System.out.println(localDateTime);
		System.out.println(dateTime);
		
		//Zone offset is use to set date with neno seconds and off set based on GST
		LocalDateTime localDateTime2=LocalDateTime.of(2019, Month.MAY, 20,06,30);
		
		ZoneOffset offset=ZoneOffset.of("+04:00");
		OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime, offset);
		
		System.out.println(offsetDateTime);
		
		
	}

}
