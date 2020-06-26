package day04operators;

import java.util.Scanner;

public class Interviewsorusu01 {

	public static void main(String[] args) {
		//
		//Iki tane veeriablenin degerlerini yer degistiriniz
	    
		//sayi1=12,	sayi2=30 .....sayi1=30, sayi2=12
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("yerlerini degistirmek icin iki sayi giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		
		//1.yol
		System.out.println("yer degistirmeden once:");
		System.out.println(sayi1);//12.0
		System.out.println(sayi2);//30.0
		
		double gecici = 0.0;
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println("yer degistirdikten spnra:");
		System.out.println(sayi1);//30.0
		System.out.println((sayi2));//12.0
		
		//2.Yol
		System.out.println("yer degistirmek icin iki sayi daha giriniz");
		
		double sayi3 = scan.nextDouble();
		double sayi4 = scan.nextDouble();
		
		sayi3 = sayi3 + sayi4;
		sayi4 = sayi3 - sayi4;
		sayi3 = sayi3 - sayi4;
		
		System.out.println("yer desirtikten sonra");
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		
		scan.close();

	}

}
