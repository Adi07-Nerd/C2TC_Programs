package dateTimeApiDemo;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateAndTimeFormatorDemo {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.of(2016, Month.AUGUST, 25, 6,59);
		System.out.println(localDateTime);
		
		String format = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(format);
		
		String format2 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(format2);
		
		String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.CANADA));
		System.out.println(format3);

	}

}
