package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// 
		
		// Kullanicidan bir String alin 
		// Bu string in index i tek sayi olan karakterleri ekrana yazdiriniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz.");
		String str = scan.nextLine();
		int num =1; 			
		do {
			System.out.println(str.charAt(num));
			num+=2;
		}while(num<=str.length()-1);
		
		
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Yazi giriniz: ");
		String str1 = scan.nextLine();
		
		int length = str1.length();
		int i =0;
		
		for(i=1; i<length-1;i+=2) {
			
			System.out.print(str.charAt(i)+" ");
		}*/

	
		scan.close();
	

	}

}
