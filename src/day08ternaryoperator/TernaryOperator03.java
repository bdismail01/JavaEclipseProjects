package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// kullanicidan iki sayi aliniz
		//kücük sayiiyi ekrana yazdirniz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println(" iki sayi giriniz");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double result =  num1<=num2 ? num1 : num2;
		System.out.println(result);
		
		scan.close();
		
		

	}

}
