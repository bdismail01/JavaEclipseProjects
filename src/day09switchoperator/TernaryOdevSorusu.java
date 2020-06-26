package day09switchoperator;

import java.util.Scanner;

public class TernaryOdevSorusu {

	public static void main(String[] args) {
		// odev sorus 5
		// bir sayi ,3 basamakli ise "3 basmakli"
		//3 basmakli degil ise ,cift mi tek mi, cift ise "3 basmakli olmayan cift sayi"
		//cift degilse " 3 basamakli olma<N TEK sayi
		
		Scanner scan = new  Scanner(System.in);
		
		System.out.println(" bir sayi girniz");
		int num = scan.nextInt();
		
		String result = (num>99 && num<1000) ? ("3 basamakli") : (num%2==0  ? "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek sayi");
		System.out.println(result);
		scan.close();

	}

}
