package day06IfStatement;

import java.util.Scanner;

public class IfElseIfstatement02 {

	public static void main(String[] args) {
		// Kullanicidan sinav notunu girmesini isteyiniz
		//Negativ girerse "Yanlis deger girdiniz yaziniz
		//50 den bü<ük ve esit ve 80 den kücük ise  ekrana"gectiniz" yazdirin
		//80 den büyük ve esit 100 den kücük ise ise  " tebrikler" yazdirin
		//o dan büyük ve esit ve 50 den kücük ise "kaldiniz"
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Lütfen sinav notunu giriniz");
		int not = scan.nextInt();
		
		if(not<=0) {
			System.out.println("Negativ deger giremezsiniz");
		}else if(not<50) {
			System.out.println("kaldiniz");
		}else if(not<80) {
			System.out.println("Gectiniz");
		}else if(not<=100) {
			System.out.println("Tebrikler");
		}else {
			System.out.println("100 den büyük deger giremeezsiniz");
		}
		scan.close();

	}

}
