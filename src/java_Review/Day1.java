package java_Review;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		/*
          1
        1   1
      1   2   1
    1   3   3   1
  1   4   6   4   1
		*/
		
		System.out.println("        1 ");
		System.out.println("      1   1");
		System.out.println("    1   2   1");
		System.out.println("  1  3    3    1");
		System.out.println("1  4    6   4   1");
		
	      /* A
		    B B
		   C   C
		  D     D
		 E       E
		F         F
		 E       E
		  D     D
		   C   C
		    B B
		     A */
		System.out.println("          A");
		System.out.println("         B  B");
		System.out.println("        C    C");
		System.out.println("       D      D");
		System.out.println("      E        E");
		System.out.println("     F          F");
		System.out.println("      E        E");
		System.out.println("       D      D");
		System.out.println("        C    C");
		System.out.println("         B  B");
		System.out.println("          A");	

		int a = 11;
		int b = 5;
		double pi = 3.14;
		
		System.out.println("a*b= "+a * b);
		System.out.println("a*pi= "+a * pi);
		System.out.println("b/a= "+b / a);
		System.out.println("a*b/pi= "+a * b / pi);
		System.out.println("a+b+pi= "+(a + b + pi));
		System.out.println("a+b= "+(a + b));
		System.out.println("a-b= "+(a - b));
		System.out.println("-pi/a= "+(-pi / a));
		System.out.println("(a+b)/pi= "+(a +b) / pi);
		System.out.println("(b/pi)= "+(b / pi) * a);
		
	
		System.out.println("hi " + 21);
		System.out.println("hi "+" harun");
		System.out.println(5 + "TechProEd"+203);
		System.out.println(7+"TechProEd"+305);
		
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3* 2 -8 % 3);
		
		
		int num = 10;
		num+=100;
		System.out.println(num);
		
		System.out.println(Math.pow(2,  3));//bir sayinin ussunu almaya
		System.out.println(Math.sqrt(144));
		System.out.println(Math.round(2.7));
		
		
		double en = 5.6;
		double boy = 8.5;
		
		
		System.out.println("Cevre ="+2*(boy + en) );
		System.out.println("alan ="+en *boy);
		
		
		/*Scanner scan  = new Scanner(System.in);
		System.out.println("En uzunlugunu giriniz"); 
		int en1 = scan.nextInt();
		System.out.println("Boy uzunlugnu giriniz");
		int boy1 = scan.nextInt();
		
		System.out.println("alan= "+en1 * boy1);
		System.out.println("boy= "+2*(boy1 + en1));*/
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("lütfen üc sayi girniz");
		int sayi1 = scan1.nextInt();
		int sayi2 = scan1.nextInt();
		int sayi3 = scan1.nextInt();
		
		System.out.println("Üc sayinin toplami= "+(sayi1 + sayi2 + sayi3));
		
				

	}

}
