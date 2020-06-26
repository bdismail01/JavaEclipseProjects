package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin 
		//Bi sayi poyitiv ise 9 dan buyuk mü diye kontrol edin
		//9 dna bü<k ise "sayi" 9 dan kücük esit ve 0 dan buyuk ise "rakam2 yaz
		//negativ ise ekrana sayi yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		
		if (num>=0) {
			
			if(num>9) {
				System.out.println("Sayi");
			}else if(num>=0 && num<=9) {
				System.out.println("Rakam");
			}
			
		}else if (num<0) {
			System.out.println("Sayi");
		}
		
		scan.close();//Scanner class ini kullandiktansonra en altta main methodun iccnde Scanner clasini kapatiniz
                     //scan.close(); yazarak kapatilir.		

	}

}
