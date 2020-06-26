package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		//kullanicidan alinan bir sayinin küpünü
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz");
		
		int sayi1 = scan.nextInt();
		System.out.println(sayi1 * sayi1 * sayi1);
		scan.close();

	}

}
