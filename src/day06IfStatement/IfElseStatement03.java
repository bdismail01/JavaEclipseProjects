package day06IfStatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// kullanicidan alacagi ürün miktarini ve fiyatini yazalim
		//eger kullanici 1000 den fazka ürün alisa %20
		//infir yapin ve fiyati ekrana yaz
		//1000 den az alirsa veya 1000 ürün alirsa indirm yapmayin ve fiatiekrana yazdir
		//para konulatindsa "double" kulllanin
		//örnek: 60 tl ye %20 == 60*80 /100
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ürün miktarini  giriniz ");
		double ürün = scan.nextDouble();
		
		System.out.println("ürünün birim fiyatini girniz");
		double fiyat = scan.nextDouble();
		
		if(ürün>1000) {
			System.out.println(ürün*(fiyat*80)/100);
		}else {
			System.out.println(ürün*fiyat);
		}
		scan.close();

	}

}
