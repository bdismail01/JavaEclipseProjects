package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		//dikdörtgenin alanve sonra cevresini yaz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen dikdortgenin en ve boyunu giriniz");
		
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		System.out.println(en * boy);
		System.out.println((en + boy) * 2);
		scan.close();

	}

}
