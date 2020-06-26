package day03oparators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		// kulllanicidan ad ve soyadin alip ekrana yazdirralim
		// string kullaniniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.nextLine(); //stringleri kullanicidan almak icin kullanilir
		                               //nextlein yazinin tamamini alir
                                       //next()tek ve ilk kelimeyi alir
		
		
		System.out.println(isim);
		
		scan.close();

	}

}
