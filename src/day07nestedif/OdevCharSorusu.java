package day07nestedif;

import java.util.Scanner;

public class OdevCharSorusu {

	public static void main(String[] args) {
		// Scanner scan = new scanner(System.if else sorusunun 4. soru
		//
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir character giriniz");
		char harf = scan.next().charAt(0);// kullanicidan char almak icin next().charAt(0) kullanilir. google den sormayi ögrenmekiyiz
		
		if((harf<=122 && harf>=97)  ||  (harf<=90 && harf>=65)) {
			System.out.println("Bu bir harftir");
		}else {
			System.out.println("Bu bir harf degildir");
		}
		scan.close();

	}

}
