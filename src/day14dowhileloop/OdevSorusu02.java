package day14dowhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alinve sayinin bolenlerini ekrana yaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num= scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i +" ");
			}
		}

	}

}
