package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOpeator05 {

	public static void main(String[] args) {
		// kullancidan bir karakter girmesini isteyiniz
		// karakter harf ise kücük harf olup olmadigini kontroll ediniz
		// kücük ise ekran "kücük harf" yazdiriniz
		//büyk ise ekrana büyük harf yazdirn
		//büyük degilse "harf degil2 yaz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir charecter giriniz");
		
		char ch = scan.next().charAt(0);
		
		String result = ((ch<122 && ch>=97) || (ch>=65 && ch<=90)) ?
				(ch<=122 && ch>=97 ? "Kücük Harf" : "Büyük Harf") : "Harf degil";
		
		System.out.println(result);
		
		scan.close();
		
		
	}

}
