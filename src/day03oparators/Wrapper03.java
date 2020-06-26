package day03oparators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		// kulllanicidan ad ve soyadini alllim ekrana yaz
		// kullanicidan adresini alalim ekran yazdiralim
		//kullaniciya yasini alalim ekrana yazdiralim
		// kullaiciya tr demi yasiyorum. dogru/yanlis diye soralimcevabi ekrana yazalim
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ad ve soyadinizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Adresinizi giriniz");
		String adres = scan.nextLine();
		System.out.println(adres);
		
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		System.out.println(yas);
		
		System.out.println("türkiyede yasiyorum. true/false ");
		Boolean blTr = scan.nextBoolean();
		System.out.println(blTr);
		
		scan.close();
		

	}

}