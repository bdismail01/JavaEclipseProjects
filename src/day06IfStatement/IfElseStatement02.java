package day06IfStatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		//kullanicidan bir tam sayi isteyin ve degerini ekrana yazdirin
		//mutlak deger bir dayinin kenfi isaretiyle carpimi demektir
		//ornek: -3 un mutlak degeri -1*-3= 3
		// 0 in mutlak degeri 0 dir
		
		Scanner  scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		
		int num = scan.nextInt();
		if(num>0) {
			System.out.println(num*(+1));
			
		}else {
		    System.out.println(num*(-1));
		}
		scan.close();

	}

}
