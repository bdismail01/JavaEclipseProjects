package aufgabe01;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		       
          //*Frage 01;
         //Kullanıcıdan başlangıç ve bitiş 
          //değerlerini alın ve başlangıç
          //değerinden başlayıp bitiş değerinde
          //biten tüm tamsayıları ekrana yazdırın 
          
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Geben Sie bitte Ihren Anfangswert  ein");
        int num1 = scan.nextInt();
        
        System.out.println("Geben Sie bitte ihren endwert ein");
        int num2 =scan.nextInt();
        
        for(int i =num1; i<num2;i++ ) {
            System.out.print(i+ " ");
            
        }
      

	}

}
