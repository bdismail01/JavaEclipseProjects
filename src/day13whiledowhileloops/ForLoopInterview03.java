package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin 
		// Bu sayinin tersinin iki fazlasini ekran yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Syai Giriniz");		
		String num = scan.nextLine();
		
		String ters ="";
		
		for(int i=num.length()-1; i>=0; i--) {
			ters = ters + num.charAt(i)+ "";// char'i String'e cevirmek icin suonuna + ""  
		}
		System.out.print(ters);
		
		int tersInt = Integer.valueOf(ters);
		tersInt = tersInt + 2;
		
		System.out.println(tersInt);
		
		

	}

}
