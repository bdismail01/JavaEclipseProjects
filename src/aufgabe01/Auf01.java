package aufgabe01;

import java.util.Scanner;

public class Auf01 {

	public static void main(String[] args) {
		//kullanicidan bir sayi alin efer sayi 3 e bölünebiliyorsa "3'ün kati" yaz
		//3 e bölünemiyorsa "3'ün kati degil" yaaz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen bir tamsayi gririniz");
		int num = scan.nextInt();
		
		if(num%3==0) {
			System.out.println("3'ün kati");
		}else {
			System.out.println("3'ün kati degildir");
		}
		scan.close();
		

	}

}
