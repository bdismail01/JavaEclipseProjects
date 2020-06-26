package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// kulllanicidan password girmesini isteyin 
		// password 4 basmakli bir sayi ise cift olup olm<digini kontorl sedin
		//cift ise password "tamam2 yazdirn
		//tek ise "tekrar deneiyn
		//passwotrf 4 basamkil degil ide "twkrar deneyin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("tam sayi olan bir Passswod giriniz");
		
		int pass = scan.nextInt();
		
		 if(pass<10000 && pass>999) {
			 
			 if(pass%2==0) {
				 System.out.println("Password tamam");
			 }else if(pass%2!=0) {
				 System.out.println("Tekrar Deneyin");
			 }
			 
			 
		 }else {
		
			 System.out.println("tekrar deneyin son");
		 }
		 scan.close();

	}

}
