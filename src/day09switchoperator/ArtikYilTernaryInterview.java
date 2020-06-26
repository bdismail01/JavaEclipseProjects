package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		// 
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("input a year");
		int year = scan.nextInt();
		
		String result = (year%100==0) ? (year%400==0 ? "artik yil" : "Artik yil degil") : (year%4==0 ? "Artik yil" : "Artik yil degil");
		System.out.println(result);

	}

}
