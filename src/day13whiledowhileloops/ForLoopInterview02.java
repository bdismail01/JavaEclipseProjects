package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Bir text giriniz");
		
		String str = scan.nextLine();
		
		
		
		int length = str.length()-1;
		while(length>=0) {
			System.out.println(str.charAt(length));
			length--;
		}
	
	
		scan.close();
		
		
	}

}
