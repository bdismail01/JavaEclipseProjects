package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirmek
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(dtf.format(date));
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dtf1.format(date));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-M-dd");
		System.out.println(dtf2.format(date));
		
		
		//Time formatini degiatirmek 
		
		LocalTime time = LocalTime.now();
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm:ss");//HH kullanicinda 24 saatlik dilim oluyor
		
		System.out.println(dtf3.format(time));
		
		//Baska ulkenin local zamanini alamk
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
