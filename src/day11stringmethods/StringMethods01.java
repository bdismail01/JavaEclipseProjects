package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// startWith() methodu bir String in istenen hsrfle basslayip baaslamadigini kontrol eder.
		//istenen harfle basliyyosa true , yoksa false verir.
		
		String str1 = "Ali Can";
		
		
		System.out.println(str1.startsWith("A"));//true
		System.out.println(str1.startsWith("B"));//false
		System.out.println(str1.startsWith("a"));//false
		
		
		System.out.println(str1.startsWith("Ali"));//true
		
		//startsWith() 2.yol
		System.out.println(str1.startsWith("a", 3));//false
		System.out.println(str1.startsWith("a", 5));//true
		
		//endsWith()  bir String in istenen hsrfle bitip bitmedigini kontrol eder.
		//istenen harfle basliyyosa true , yoksa false verir.
		
		String str2 = "Ayse Canan";
		System.out.println(str2.endsWith("n"));//true
		System.out.println(str2.endsWith("Canan"));//true
		System.out.println(str2.endsWith("CANAN"));//false
		
		
		
		
		
		
		
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" "));//true
		System.out.println(str3.endsWith(""));//true
		
		
		
		
		
		
		

	}

}
