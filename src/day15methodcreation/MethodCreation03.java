package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// bsit hesap makinasi
		// Kullanicidan yapacagi islemi islem ssembolu ile  secmesini saglayan
		//Kulllancidan iki sayi girmesini isteyelim 
		//giriken iki sayi ve secilen isleme gore dogru sonucu ekran yaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("+,-,*,: islemlerinden birini seciniz");
		char islem = scan.next().charAt(0);
		System.out.println("islem yapmak icin ikki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		hesapMakinasi(islem,num1,num2);
		
		scan.close();

	}
	
	public static void hesapMakinasi(char islem, double num1, double num2) {
		
		switch(islem) {
		
		case '+':
			System.out.println(num1 + "+" + num2 + "=" +(num1+num2));
			break;
		case 'x':
			System.out.println(num1 + "x" + num2 + "=" +(num1*num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" +(num1-num2));
			break;
		case ':':
			System.out.println(num1 + ":" + num2 + "=" +(num1/num2));
			break;
		default:
			System.out.println("+,-,x,: disinda bir islem secmeyiniz");
		}
		
		
		
	}
	
	
	

}
