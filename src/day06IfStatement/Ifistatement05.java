package day06IfStatement;

import java.util.Scanner;

public class Ifistatement05 {

	public static void main(String[] args) {
		// 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdortgenin enini giriniz");
	    double en = scan.nextDouble();
	    
		System.out.println("Dikdortgenin boyunu giriniz");
		double boy = scan.nextDouble();
		
		/*if (en==boy) {
			System.out.println("bu bir karedir");
		}
		if(en!=boy) {
			System.out.println("bu bir dikdortgendir");
		}*/
		
		//else diger ihtimallerin tamamidir
		
		if(en==boy) {
			System.out.println("Bu bir karedir");
		}else {
			System.out.println("Bu bir dikdortgendir");
		}
		scan.close();

	}

}
