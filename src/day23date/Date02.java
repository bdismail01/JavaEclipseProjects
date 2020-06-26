package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date manipulation  (Date uzerinde degisiklik yapmak)
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		System.out.println(date.plusDays(3));
		System.out.println(date.plusDays(13));
		System.out.println(date.plusDays(-1));//Bu cok kullaanilmaz. Baska methodlar kullanilir.
		
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusYears(2));
		System.out.println(date.plusWeeks(2));
		
		//cikarmasi olmaz mi
		System.out.println();
		System.out.println(date.minusDays(3));
		System.out.println(date.minusWeeks(1));
		System.out.println(date.minusMonths(2));
		System.out.println(date.minusYears(4));
		
		
		
		
	}

}
