package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
		// kullanicidan bir string alin ve ekrana tersten yazdirn
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Bir text giriniz");
		
		String str = scan.nextLine();
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));//naC ilA
		}
		
		int length = str.length()-1;
		while(length>=0) {
			System.out.println(str.charAt(length));
			length--;
		}
		scan.close();

	}

}
