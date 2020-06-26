package day06IfStatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		// Kullanicidan 6 basmakli bir sayi isteyin. 0 ile de baslayabilir
		//kazanma ihtimyli %20, amorti itimaali %33, kaybetme ihtimali %50 olan bir oyun yaziniz
		//000000-000001-000002-...999998-999999==>
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("6 basamakli bir sasyi giriniz. sifir baste olabilir");
		int num = scan.nextInt();
		
		
		if(num<200000) {
			System.out.println("Kazandiniz");
		}else if(num<500000) {
			System.out.println("Amorti");
		}else {
			System.out.println("Kaybettiniz");
		}
		scan.close();

	}

}
