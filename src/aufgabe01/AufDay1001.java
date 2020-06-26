package aufgabe01;

import java.util.Scanner;

public class AufDay1001 {

	public static void main(String[] args) {
		//       
        /*Frage 01;
         *Kullanıcıdan başlangıç ve bitiş 
          değerlerini alın ve başlangıç
          değerinden başlayıp bitiş değerinde
          biten tüm tamsayıları ekrana yazdırın */
          
         
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren Anfangswert und Endwert ein");
        int num1 = scan.nextInt();
        int num2 =scan.nextInt();
        
        for(int i =num1; i<num2;i++ ) {
            System.out.println(i+ " ");
            
        }*/
        
        /*Frage02;
         
        Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç 
        değerinden başlayıp bitiş değerinde  biten tüm tamsayıların çarpımını ekrana yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren Anfangswert und Endwert ein");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int product=1;
        for(int i = num1; i<num2; i++) {
            product = product*i;
        }System.out.println(product);
        
        */
        
    
    
    /*Frage03;
    Kullanıcıdan başlangıç ve bitiş  
    değerlerini alın ve başlangıç değerinden 
    başlayıp bitiş değerinde  biten tüm tamsayıların
     toplamını ekrana yazdırın
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Geben Sie bitte Ihren Anfangswert und Endswert ein");
    int num1=scan.nextInt();
    int num2 = scan.nextInt();
    
    int sum =0;
    for(int i = num1; i<num2; i++) {
        sum = sum+i;
    }System.out.println("Die Summe = "+ sum);*/
    
     
     /*Frage 04;
        Kullanıcıdan başlangıç ve bitiş  değerlerini alın 
        ve başlangıç değerinden veya sonrasından  başlayıp
        bitiş değerinde veya öncesinde  biten tüm 3 ile 
        bölünebilen tamsayıları ekrana yazdırın.
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren Anfangswert und Endwert ein");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        
        for(int i = num1; i<=num2; i=i+3) {
            System.out.println(i);
           } */
            
        
    /*Frage 05; 
      Kullanıcıdan başlangıç ve bitiş  değerlerini alın 
      ve başlangıç değerinden başlayıp bitiş değerinde  biten 
      tüm tamsayıların toplamını ekrana yazdırın
    
            
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Geben Sie bitte Ihren Anfangswert  ein");
        int num1 = scan.nextInt();
        
        System.out.println("Geben Sie bitte Ihren Edwert  ein");
        int num2 = scan.nextInt();
                
        int sum =0;
        for(int i=num1; i<=num2; i++) {
            sum=sum+i;
                    
        }System.out.println(sum);
        
        */
        
        /*Frage 06;
         * Kullanıcıdan başlangıç ve bitiş  harflerini alın ve 
         * başlangıç harfinden başlayıp bitiş harfinde  biten 
         * tüm harfleri büyük harf olarak ekrana yazdırın 
         */  
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("Geben Sie bitte Ihren Anfangsbustaben  ein");
        char a  = scan.next().toUpperCase().charAt(0);
        
        
        System.out.println("Geben Sie bitte Ihren Endsbustaben  ein");
        char e  = scan.next().toUpperCase().charAt(0);
        
        for(char chr =a; chr<=e; chr++) {
            System.out.println("character = "+ chr );
            
        }scan.close();
        
        
	}

}
