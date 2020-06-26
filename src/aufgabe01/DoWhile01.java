package aufgabe01;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*edv 1:
		 * 
		//9 dan 190 a kadar 7 nin kati yazdir
		int num =9;
		do {
			if(num%7==0) {
				System.out.print(num+" ");
				
			
			
			}num++;
			
		}while(num<=190);*/
		
		
		//odev 2:
		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde  biten
		//4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic Degeri giriniz");
		int ilk = scan.nextInt();
		
		System.out.println("Bitis Degeri giriniz");
		int son = scan.nextInt();
		
		do {
			if((ilk%4==0  && ilk%6==0) ) {
			System.out.print(ilk+ " ");
				
			}ilk ++;
			
			
			
			
		}while(ilk<son);
		
		//odev 3:
		
		
		
		
		
		

	}

}
