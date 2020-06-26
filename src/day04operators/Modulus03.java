package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		//Kullanicidan sayi bir tam sayi alin rakamlari toplami
		
		Scanner scan = new Scanner(System.in);
		System.out.println("dört basmakli sayi giriniiz");
		 
		int s = scan.nextInt();
		
		int sonRakam = s % 10;
		int v = s / 10;
		int ikinciRakam = v % 10;
		int d = s / 100;
		int ücüncüRakam = d % 10;
		int ilkRakam = s / 1000;
		
		System.out.println(sonRakam + ikinciRakam + ücüncüRakam + ilkRakam);
		scan.close();

	}

}
