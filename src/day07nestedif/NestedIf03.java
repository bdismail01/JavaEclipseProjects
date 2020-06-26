package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		// ARTIK YIL sorusu
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("yil giriniz");
		int yil = scan.nextInt();
		
		if(yil%100==0) {
			
			if(yil%400 ==0) {
			System.out.println("Artik yil");
			}else {
				System.out.println("Artik yil ddgil");
			}
		}else if(yil%100!=0){
			
			if(yil%4 ==0) {
				System.out.println("Artik yil");
			}else {
			System.out.println("Artik yil ");
			}
			
		}
		scan.close();

	}

}
