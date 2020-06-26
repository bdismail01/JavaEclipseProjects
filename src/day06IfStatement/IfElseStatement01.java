package day06IfStatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		//Kullanicidan  Password girdin
		//dogru ise "Paswod dogru"yazdirin
		//yanlis ise "Pasword yanlis tekrar deneyin"yaz
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Lütfen Password Girirniz");
		 String pas = scan.nextLine();
		  
		 //Stringlerin esitligini kontrol ederkenasla iki tant esit kullanmayin onun yerine eguals i kullan
		 // == sembolü Stringin adresini vedegerini kontrik eder
		 //eguals() ise sadece deerkeri kontrol eder.
		 
		 if (pas.equals("Java2020")) {
			
			 System.out.println("Password dogru");
		 }else {
			 System.out.println("Password yanlis tekrar deneyin");
			 
		 }
		 
		 
		scan.close();

	}

}
