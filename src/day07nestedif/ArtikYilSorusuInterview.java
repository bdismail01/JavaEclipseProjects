package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// kulllanicidan xil girmesini iste<in
		//girlen yil artik <il ise "Artik yil "
		
		//artik yil dfgilse "Artik yil Degil" yazdirin
		// ARTIK yil dört yilda bir 29 subat dört yil da bir oöur
		//artik yil 100 e bökünürse 400 e de bölünmeli veya 100 bölünmezse 4 e bölpnmeli
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir yil giriniz");
		int yil = scan.nextInt();
		
		if(yil %100==0 && yil%400==0 ) {
			System.out.println(yil +" Artik yildir");
			}else if(yil %100 !=0 && yil%4==0) {
			System.out.println(yil +" Artik yildir");
			}else {
				System.out.println(yil + " Artik yil degildir");
			
		}
		scan.close();
		

	}

}
