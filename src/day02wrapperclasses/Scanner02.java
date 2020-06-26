package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		//Karenin bir kenar uunkugunu girsi 
		//karenin cevvresini ve alanini ekrana yazdir
		//kareni cevresini bulunuy
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen karenin bir kenar uzunlugunu giriniz.");
		int kenarUzunlugu = scan.nextInt();
		System.out.println(kenarUzunlugu + kenarUzunlugu +kenarUzunlugu + kenarUzunlugu );
		System.out.println(kenarUzunlugu * kenarUzunlugu);
		scan.close();

	}

}
