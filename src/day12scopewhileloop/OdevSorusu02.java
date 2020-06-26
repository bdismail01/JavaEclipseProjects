package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// baslangic ve bitis degeri alin
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("baslangic degerini giriniz");
		int num1 = scan.nextInt();
		
		System.out.println("bBitis degerini giriniz");
		int num2 = scan.nextInt();
		
		if(num1>=num2) {
			System.out.println("Baslangic degeri bitis degerinden kucuk olmalidir");
		}else {
			
			for(int i=num1; i<=num2; i=+1) {
				if(i%3==0) {
					System.out.println(i);
				}
				
			}
			
			
			
			
		}

	}

}
