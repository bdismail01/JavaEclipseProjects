package day04operators;

import java.util.Scanner;

public class OdevSorusuCozümü01 {

	public static void main(String[] args) {
		
		//Klullanicidan integer aldiktan sonra String alamiyoruz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("yasinizi giriniz");
		String yas = scan.nextLine();
		int yeniYas = Integer.parseInt(yas);// String i tam sayiya cevirmeyfe yarar
		System.out.println(yeniYas + 1);
		
		System.out.println("Adinizi ve soyadiniz giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);
		scan.close();

	}

}
