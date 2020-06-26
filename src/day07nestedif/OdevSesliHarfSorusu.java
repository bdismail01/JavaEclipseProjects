package day07nestedif;

import java.util.Scanner;

public class OdevSesliHarfSorusu {

	public static void main(String[] args) {
		//Kullanicidan bir harf alin 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" a,e,i,o,u,b,c,d,f harflerinden bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		if(harf=='a'|| harf=='e' || harf=='o'|| harf=='u'){
			
			System.out.println("sesli harftir.");
		}else if (harf=='b' || harf=='c' || harf=='d'||harf=='f') {
			System.out.println("sessiz harftir.");
		}else {
			System.out.println("Yanlis harf girdiniz.");
		}
		scan.close();

	}

}
