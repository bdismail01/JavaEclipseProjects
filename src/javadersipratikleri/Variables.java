package javadersipratikleri;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		//
		
//		System.out.println("ismail Muhtar");
//		System.out.println("Isim: " +"Ismail");
//		
//		String isim = "Ismail";
//		String soyadi = "Muhtar";
//		System.out.println(isim + " " + soyadi);
//		
//		
//		//ekran ciktisi tahmin edin
//		System.out.print(1);
//		System.out.println(2);
//		System.out.print(3);
//		System.out.println(4);
//		
		
		
//		int nm = 11;
//		System.out.println(nm);
//		
//		String str = "merhaba";
//		System.out.println(str);
//		
//		char ch ='t';
//		System.out.println(ch);
//		
//		boolean bl = true;
//		System.out.println(bl);
//		
//		long ln = 1234;
//		System.out.println(ln);
//		
//		double dl = 62;
//		System.out.println(dl);
//		
//		float fl = 5.2f;
//		System.out.println(fl);
		
		//asagidaki sonuc nedir
		
//		int harf ='1';//ascii degeri 49
//		char ch = '2';//ascii degeri 50
//		
//		System.out.println(harf + ch);//99
//		System.out.println(17 + "" + 3);//173
//		System.out.println("" + 17 +3);//173 String ten sonrakileri hep string olarak alglar
//		System.out.println(harf + "" + ch);//49+2 yi birlestirir 492
//		System.out.println(harf);//49
//		System.out.println(ch);//2 char olarak kabul eder
//		
//		//ascii deegerlerini bulma
//		
//		int unlem = '!';
//		System.out.println(unlem);
//		
//		int kalan = '%';
//		System.out.println(kalan);
//		
//		int carpim = '*';
//		System.out.println(carpim);
//		
//		int ve ='&';
//		System.out.println('&' +" ASCII Code Degeri: "+ ve);
//		
//		int at = '@';
//		System.out.println('@' + " ASCII Code Degeri: " + at);
		
		
		
		
//	int ve long data type lerin max ve minumum lari bulup yaz
		
//	

		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		long min = Long.MIN_VALUE;
		System.out.println(min);
		
//kullanicida iki farkli kelime yazin
		//
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Birnci kelimeyi yaziniz");
//		String str1 = scan.next();
//		
//		System.out.println("Ikinci kelimeyi giriniz");
//		String str2 = scan.next();
//		
//		String cumleSonuIsareti = "!";
//		
//		String yeniCumle = str1 + " " + str2 + cumleSonuIsareti;
//		System.out.println(yeniCumle);
		
		
		
		//kullanicidan iki sayi aliniz
//		
//		Scanner sc = new Scanner(System.in);
//		 
//		System.out.println("ilk sayiiy giriniz");
//		int num1 = sc.nextInt();
//		
//		System.out.println("iknci sayiiy giriniz");
//		int num2 = sc.nextInt();
//		
//		int ilkkare = num1*num1;
//		System.out.println("Ilk sayi karesi...: " + ilkkare);
//		
//		int ikincikare = num2*num2;
//		System.out.println("ikinci sayi karesi: " +ikincikare);
//		
//		int ilkCarpim =num1*5;
//		System.out.println("Ilk sayi carpim...: " + ilkCarpim);
//		
//		int ikinciCarpim = num2*5;
//		System.out.println("Ikinci sayi carpim: " + ikinciCarpim);
//		
//		int eklenecekSayi = 12;
//		int ilk12ekle =num1+12;
//		System.out.println(ilk12ekle);
//		
		
		int num1 =23;
		int num2 =54;
//		System.out.println("degismaden onceki: ");
//		System.out.println("num1: "+ num1);
//		System.out.println("num2: " + num2);
//		
//		int bos = 0;
//		
//		bos = num1;
//		num1 = num2;
//		num2 = bos;
//		
//		System.out.println("sonra");
//		System.out.println("num1: " + num1);
//		System.out.println("num2: " + num2);
//		
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1);
		System.out.println(num2);
		
	
		
	}

	
}
