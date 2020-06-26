package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// kullanicidan iki sayi alin sayilar eesit ise 
		// toplamlarini  farkli ise carpimlarini ekran yaz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double sonuc = (num1==num2) ?  (num1 + num2)  : (num1 * num2);
		System.out.println(sonuc);
		
		

	}

}
