package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		// kulanicinin adinii ve soyadini aliniz
		//console yaziniz
		//sadece adini yazdirin
		//ad ve soyadinin ilk harfleeini yazdrirn
		//ad ve soyadi tersten yazdirin
		//ad ve soyad'da kullanlilan tum karachterleri ekrana yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String ad = scan.nextLine();
		
		System.out.println("soyadinizi giriniz");
		String soyad = scan.nextLine();
		
		System.out.println(ad + " "+ soyad);
		System.out.println(ad);
		System.out.println(ad.charAt(0));
		System.out.println(soyad.charAt(0));
		
		String sr ="";
		for(int i=ad.length()-1; i>=0; i--) {
			sr +=ad.charAt(i); 
		}
		System.out.println("ad tersten: " + sr);
		
		String sr2 ="";
		for(int i=soyad.length()-1; i>=0; i--) {
			sr2 +=soyad.charAt(i); 
		}
		System.out.println("Soyadi tersten: " + sr2);
		
		
		StringBuilder str1 = new StringBuilder("ismail");
		System.out.println(str1.reverse());
		
		StringBuilder str2 = new StringBuilder("Muhtar");
		System.out.println(str2.reverse());
		
		StringBuilder str3 = new StringBuilder(ad+ " "+ soyad);
		System.out.println(str3.reverse().toString());
		
		
		String tamAd= ad.concat(soyad);
		System.out.println(tamAd);
		String harfArr[] = tamAd.split("");
		Arrays.sort(harfArr);
		System.out.println("Harfler alfabetik siarda:" + Arrays.toString( harfArr));
		
		scan.close();

	}

}
