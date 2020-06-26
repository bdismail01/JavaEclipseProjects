package aufgabe01;

import java.util.Scanner;

public class Replit02 {

	public static void main(String[] args) {
		
		/*  Scanner in = new Scanner(System.in);
		   
		   int num1 = in.nextInt();
		   int num2 = in.nextInt();
		   int num3 = in.nextInt();
		   
		     // Write your code here
		     
		     if(num1>num2 && num1>num3){
		    System.out.println(num1);
		     }
		     else if(num2>num3 ) {
		    System.out.println(num2);
		     }else {
		   System.out.println(num3);
		     }  */
	 
		     Scanner input = new Scanner(System.in);
		        int number1 = input.nextInt();
		        int number2 = input.nextInt();
		    
		     // Write your code here
		     if(number1>=number2){
		       System.out.println(number1+"!="+number2);
		       }else {
		       System.out.println(number1+"<"+number2);
		       }
		     
		     if(number1>number2){
		       System.out.println(number1+">"+number2);
		     }else{
		       System.out.println(number1+"<"+number2);
		     } 
		     
		     if(number1==number2){
		       System.out.println(number1+"=="+number2);
		     }else{
		       System.out.println(number1+"!="+number2);
		     }
		     
		     
		        
		     


	}	

}
