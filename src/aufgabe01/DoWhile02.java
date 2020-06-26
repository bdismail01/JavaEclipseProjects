package aufgabe01;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("isminizi giriniz");
		String ilkIsim = scan.nextLine().toLowerCase();
		
		System.out.println("geben sie bitte nachname ein");
		String soyIsim = scan.nextLine().toLowerCase();
		isimYazma(ilkIsim, soyIsim);
	
	
	}
	
	public static void isimYazma(String ilkIsim, String soyIsim) {
		ilkIsim = ilkIsim.substring(0,1).toUpperCase() + ilkIsim.substring(1);
		soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1);
		
		System.out.println(ilkIsim + " " + soyIsim);
		
	}

}
