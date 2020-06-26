package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu03 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		
		System.out.println("baslangic harfini giriniz");
		char ch1 = scan.next().toUpperCase().charAt(0);
		
		System.out.println("bBitis harfini giriniz");
		char ch2 = scan.next().toUpperCase().charAt(0);
		
		System.out.println(ch1 + "-" + ch2);
		
		if(ch1>ch2) {
			System.out.println("Alfabetik sirayla giirniz");
		}else if((ch1<='Z' && ch1>='A') && (ch2<='Z' && ch2>='A' )){
			for(char i=ch1; i<=ch2;i++) {
				System.out.print(i + " ");
			}
			
				
			}else {
				System.out.println("Baslangic ve bitis harf olmali");
			
		}

	}

}
