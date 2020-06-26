package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		// ternary operator (if else if)
		// Kullanicidanbir sayi aliniz
		// sayi o dan buyuk esit ise "10 dan kpcpk olup olmadigini kontrol ediniz
		// kücük ise ekrana " rakam" degilse "pozitiv sayi"
		//sayi kücük ise " negativ"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir tamsayi giriniz");
		
		int num = scan.nextInt();
		
		String result = num >=0 ? (num<10 ? "Rakam" : "Pozitiv sayi") : "negativ";
		System.out.println(num + " "  + result +"dir");
		
		scan.close();

	}

}
