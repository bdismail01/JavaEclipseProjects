package day16owerloading;

import java.util.Scanner;

public class OdevSorusu01 {
	

	public static void main(String[] args) {
		// bir sayi gir
		//rakamlari toplami yazdir
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		 int num = scan.nextInt();
	   rakamToplami(num);
	}
	
	public static void rakamToplami(int num) {
		int sum=0;
		
		while(num!=0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("RAKAMALR TOPLAMI: "+ sum);
		
	}
	

}
