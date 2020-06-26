package aufgabe01;

import java.util.Scanner;

public class Auf03 {

	public static void main(String[] args) {
		//
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen gün giriniz");
		String day = scan.nextLine();
		
		if(day.equalsIgnoreCase("cuma") ) { //egualsIgnoreCase() büyük kücük harf dikkate almaz
			System.out.println("Müslümanlar icin kutsal gün");
			
			
		}else if(day.equalsIgnoreCase("cumartesi") ) {
			System.out.println("Yahudiler icin kutsal gün")
			;
		}else if(day.equalsIgnoreCase("pazar") ) {
			System.out.println("Hiristiyanlar icin kutsal gün");
			
		}else {
			System.out.println("Bu gün kutsal bir gün degildir");
		}
		scan.close();

	}

}
