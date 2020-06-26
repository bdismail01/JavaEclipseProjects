package day06IfStatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		
		// kullanicidan yasini alin 
		//yas 13 den az ise ekran calisamaz yaz
		//yas 13 den 65 e kaadar ise ekrana "Calisabilir" yazdirin
		//yas 65 den buyuk ise "emekli" yaz
		//negativ sayi girerse "Yas negativ olamaz"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("yasinizi giriniz");
		int yas = scan.nextInt();
		
		if(yas<0) {
			System.out.println("Yas negativ olamaz");
		}else if (yas<13) {
			System.out.println("Calisamaz");
		}else if (yas<=65) {
			System.out.println("Calisabilir");
		}else {
			System.out.println("Emekli");
		}
		scan.close();
				

	}

}
