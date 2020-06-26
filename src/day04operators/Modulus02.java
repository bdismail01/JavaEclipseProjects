package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		//
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dort basamakli bir sayi giriniz");
		
		int s = scan.nextInt();// bir tam sayinin birler bsasamagini bulmak icin 10 a böjeriz.
		int sonRakam = s % 10;
		int ilkRakam = s / 1000;
		
		System.out.println(sonRakam + ilkRakam);
		scan.close();

	}

}
