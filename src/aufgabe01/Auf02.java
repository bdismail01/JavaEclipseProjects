package aufgabe01;

import java.util.Scanner;

public class Auf02 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. “b, c, d, e” den biri ise ekrana “Sessiz harf” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir harf giriniz");
		String harf = scan.nextLine();
		 if(harf.equals("a") || harf.equals("e") || harf.equals("o") || harf.equals("u") ) {
			 System.out.println("Seseli harf");
		 }else if(harf.equals("b") || harf.equals("c") || harf.equals("d")) {
			 System.out.println("Sessiz harf");
		 }else {
			 System.out.println("Yanlis harf girdiniz bir daha deneyiniz");
		 }
		
		scan.close();

	}

}
