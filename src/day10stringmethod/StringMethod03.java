package day10stringmethod;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		//charAt
		
		String str1 = "cimbombom"; //str1 in 4. indexini bulan kodu yaz
		System.out.println(str1.charAt(4));//'o' harfi
		System.out.println(str1.charAt(0));// ilk index 0. harf 'c' dir
		//System.out.println(str1.charAt(10));// olmayan bir index girince console "excepiton" verir
		
		//length() methodu Stringin icinde kac character olldugunu verir
		System.out.println(str1.length());//ekrana 9 yazdirir. index saymaya 0 dan , length ise 1 den baslar
        //son indexi 9 olan bir String in length i kactir.
		//cevao= 9+1:10
		//length: son index + 1
		
		
		//kullanicidan ismaini girmesini isteyin ve ismini son harfini ekrana yaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi giriniz");
		
		String isim = scan.nextLine();
		
		int length = isim.length();
		System.out.println(isim.charAt(length-1));
		scan.close();

	}

}
