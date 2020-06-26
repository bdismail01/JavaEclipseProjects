package java_Review;

import java.util.Random;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// verilen iki sayini yerini degistirelim
		
	/*	int num1 = 11;//33
		int num2 = 33;// 11
		
		
		
		System.out.println("degisiklik oncesi"  );
		System.out.println("1.sayi= "+num1);
		System.out.println("2.sayi= "+num2);
		
		//ilk bos bir deger atayacagiz
		
		int bos = num1;
		    num1 = num2;
		    num2 = bos;
		//degisiklik sonrasi 
		    
	    System.out.println("degisiklik sonrasi"); 
	    System.out.println("1.sasyi= "+num1);
	    System.out.println("2.sayi= "+num2);
	    */
	    
	  //*** interview question***
	       // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
	 /*      int  x = 50; //=>10
	       int  y  = 10; //=>50
	       System.out.println(x);
	       System.out.println(y);
	       
	       
	       x = x+y;
	       y = x-y;
	       x = x-y;
	       System.out.println(x);
	       System.out.println(y);
	       
	       /*
	        * num1=15;
	        * num2=25;
	        * 
	        * 
	        * num1= num1 + num2;
	        * num2= num1 - num2;
	        * num1= num1 - num2;
	        */ 
	     //0 ile 1000 arasında random bir sayı oluşturarak 
	     //  bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?	
	     //random sayi= 185  toplamları = 14  
	    
	   /*    
	       int randomSayi= (int)(Math.random()*1000);// 0 ile 1000 arasi sayi
	      // int randomSayi= (int)(Math.random()*10)+10;//10 ile 20 arasi
	       System.out.println("Random sayi= "+randomSayi);
	      
	       
	       int birler = randomSayi%10;
	       
	       randomSayi = randomSayi/10;
	       int onlar = randomSayi%10;//10 lar basmagi
	       int yüzler = randomSayi/10;//100 ler basamak
	       
	       System.out.println("Toplamlari= "+(birler+onlar+yüzler));
	    */   
	       /* 
	        scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
	        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
	        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
	        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
	                 Harun
	                 Ekinci
	        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
	                 1983
	                 2020        
	        5.Adım Raporu aşağıdaki gibi yazdırınız      
	                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
	        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
	           //Şifre= 37HEi56        
	        */
	       
	 /*      
	       Scanner scan = new Scanner(System.in);
	       String ad,soyAd,rapor;
	       int d_yil, b_yil;
	       
	       
	       System.out.println("lütfen adinizi giriniz");
	       ad= scan.nextLine();
	       
	       System.out.println("Lütfen soyadinizi giriniz");
	       soyAd=scan.nextLine();
	       
	       System.out.println("lütfen Dogum yilinizi giriniz");
	       d_yil=scan.nextInt();
	       
	       System.out.println("lütfen simdiki yili giriniz");
	       b_yil =scan.nextInt();
	       
	       int yas = (b_yil-d_yil);
	       rapor= "adiniz: "+ad+ "soyad: "+soyAd+ "yasiniz: "+yas;
	       
	       System.out.println(rapor);
	       
	       int sifre=yas + ad.charAt(0)+soyAd.charAt(0)+soyAd.charAt(soyAd.length()-1)
	       + ad.length()+soyAd.length();
	       System.out.println("sifreniz: "+sifre);
	    */   
	       
	       
	    // Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	       // saat,dakika, saniye -->int
	       // PM veya AM--> String
	       // Örn: 11:25:33 PM
	   /*    
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("saat girniz");
	       int saat = sc.nextInt();
	       
	       System.out.println("dakika giriniz");
	       int dk = sc.nextInt();
	       
	       System.out.println("sn giriniz");
	       int sn = sc.nextInt();
	       
	       System.out.println("AM veya PM degerini girniz");
	       String amOrPm = sc.next();
	       
	       System.out.println(saat + ":" +dk + ":" +sn+" "+ amOrPm);
	     */  
	       
	       
	       Scanner scan = new Scanner(System.in);
	       
	       System.out.println("kontrol edilecek sayiyi giriniz");
	       int x = scan.nextInt();
	       
	       if (x%2==0) {
	    	   System.out.println("sayiniz cift sayidir");
	       }else {
	    	   System.out.println("sayiniz tek sayidir");
	       }
	       
	scan.close();
	    

	}

}
