package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);// Scanner class'ini import ettik
		System.out.println("Lutfen iki tam sayi giriniz.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);
		
		//kullanici karenin bir kenar uunlug girsin
		//karenin cevrewini ve alanin ekran yazdir
		scan.close();

	}

}
