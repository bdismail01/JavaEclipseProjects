package aufgabe01;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		 /*Frage 05; 
	      Kullanıcıdan başlangıç ve bitiş  değerlerini alın 
	      ve başlangıç değerinden başlayıp bitiş değerinde  biten 
	      tüm tamsayıların toplamını ekrana yazdırın
	    */
	            
	        Scanner scan = new Scanner(System.in);
	                
	        System.out.println("Geben Sie bitte Ihren Anfangswert  ein");
	        int num1 = scan.nextInt();
	        
	        System.out.println("Geben Sie bitte Ihren Edwert  ein");
	        int num2 = scan.nextInt();
	                
	        int sum =0;
	        for(int i=num1; i<=num2; i++) {
	            sum=sum+i;
	                    
	        }System.out.println(sum);
	        
	        
	       
scan.close();
	}

}
