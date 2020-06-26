package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// kullaniciden haftanin gün numarasinn girsin
		//programiz günün ismini yazsin
		//yanlis gün igrerse "Gecerli gün sayisi giriniz
		//switch
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Haftanin gün numarasini giriniz");
		
		int daynum = scan.nextInt();
		
		switch (daynum) {
		case 1:
			System.out.println("payrtesi");
			break;
		
		
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("Carsasmba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
			
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
		default:
			System.out.println("Gecerli gün griniz");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

}
