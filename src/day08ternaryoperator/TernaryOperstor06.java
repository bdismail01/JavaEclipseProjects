package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperstor06 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz 
		// sayi cift ise 10 a bolünüp bölünmedigini kontro ediniz 
		// bölünüyorsa "wooow" yaz
		// 10 bölünmüyorsa "Yazik " yaz
		//sayi tek ise 5 e bölünüyorsa "woow 5" yokssa "yazik 5" yaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz ");
		
		double num = scan.nextDouble();
		 String result= num%2==0 ? num %10==0 ?  "wooow" : "yazik" : num%5==0 ? "woow 5" :"yazik 5";
		 System.out.println(result);
		scan.close();
		

	}

}
