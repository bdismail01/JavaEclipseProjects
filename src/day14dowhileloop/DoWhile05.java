package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		//
		
		// Kullanicidan ismini alin
		// Ilk harf buyuk harf ise ekrana dogru giris yaptiniz. yazdiriniz
		// Ilk harf kuyuk harf ise "ilk harfi buyuk harf olarak giriniz diyelim.

		Scanner scan = new Scanner(System.in);
		String isim = "";
		
		do {
			System.out.println("Lutfen ilk harf buyuk olarak isminizi giriniz.");
			isim = scan.nextLine();

		} while (!(isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z'));  

		System.out.println("Dogru giris yaptiniz"); // Dongu durunca bunu yazacak 
		
		scan.close();
	


	}

}
