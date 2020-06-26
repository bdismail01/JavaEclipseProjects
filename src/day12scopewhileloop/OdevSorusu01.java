package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// yasadigi ulkenin ismini alin
		//bastan iknci harf ile sondan ikinci harfi buyuk harf ol<r<k ekrana yaz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yasadiginiz ulkenin ismini giriniz");
		String ulke = scan.nextLine();
		
		System.out.println(ulke.toUpperCase().charAt(1));// ikinci harfin indexi 1 dir
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));

	}

}
