package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz sayi pozitiv ise ekrana "pozitiiv"
		// sayi negetiv isee "negetiv" yaziniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
		
		double num = scan.nextDouble();
		
	//
	//	if(num>=0) {
	//		System.out.println("pozitiv ve o");
	//	}else {
	//		System.out.println("negativ");
	//	}
		
		// ternary operator
		//condition soru isareti ? eger  dogru ise , sonraa iki noktta, eger yanlis ise 
		String sonuc = (num>=0)        ?           "pozitiv ve o"       :              "negativ";
		System.out.println(sonuc);
		
		scan.close();

	}

}
