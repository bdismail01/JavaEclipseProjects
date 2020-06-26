package aufgabe01;

import java.util.Scanner;

public class Auf04 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen iki sayi giriniz");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		if((num1<=0 && num2 <=0) ||  (num1>=0 &&  num2>=0)) {
			System.out.println("Ayni isaretli");
		}else {
			System.out.println("Farkli isaretli");
		}
		scan.close();

	}

}
