package day23date;

import java.time.LocalTime;

public class Day03 {

	public static void main(String[] args) {
		// Time manipulation
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		System.out.println();
		
		System.out.println(time.plusHours(2));
		System.out.println(time.plusMinutes(30));
		System.out.println(time.plusSeconds(40));
		
		System.out.println();
		
		System.out.println(time.minusSeconds(40));
		System.out.println(time.minusMinutes(15));
		System.out.println(time.minusHours(3));
		
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		

	}

}
