package day03oparators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
	
		//kullanicidan ilk ismini alin ekrana yazfir
		//kullanicidan soy ismini alin ekrana ilk isminin altina yaz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen ilk isminizi giriniz");
		String ilkIsim = scan.nextLine();
		
		System.out.println("Soy isminizi giriniz");
		String soyIsim = scan.nextLine();
		
		System.out.println(ilkIsim);
		System.out.println(soyIsim);
		
		scan.close();
		}

}
