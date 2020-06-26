package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		// concat() method iki stringi birlestirmenin diger yoludur
		
		String str1 = "Ali";
		String str2 = "Veli";
			System.out.println(str1 + str2);//AliVeli
			System.out.println(str1.concat(str2));//AliVeli
			
		System.out.println(str1.concat(str2).concat(str1));	
		System.out.println(str1.concat("==>").concat(str2));
		
		//replace() methodu bir characterin yerine baska bir character koymaya yarar
		//1.version
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));//ana
		System.out.println(str3.replace("a", "o"));//oto  .bütün characterleri bulup degistiriyor
		System.out.println(str3.replace("x", "y"));// x olmadigi iicn herhangi bir degiiskli yapmaz
		System.out.println(str3.replace("", "y"));//yaytyay hicbirseyin yerine y koydu
		System.out.println(str3.replace("t", ""));//aa olur yanit yi siler.bir
		                                           //characteri sringten siler
		System.out.println(str3.replace("at", "Mustaf"));
		System.out.println(str3.replace("at", "y"));//ya
		
		//2,version replaceFirst() methodu degistirmek istedigimiz characterin ssdece ilk gorunumu degistirir
		String str4 = "karakartal";
		System.out.println(str4.replaceFirst("k", "K"));// Karakartal    ilk harfi buyuk yapmis oluruz
		System.out.println(str4.replaceFirst("a", "e"));//kerakartal
		System.out.println(str4.replaceFirst("ka", "A"));//Arakartal
		System.out.println(str4.replaceFirst("kar", ""));//akartal
		System.out.println(str4.replaceFirst("kara", "A"));//Akartal
		System.out.println(str4.replaceFirst("karakartal", "cimbombom"));//cimbombom
		
		//soru
		String text = "Ali okula gitti . Ali otobuse bindi. ali eve geldi.ali yemek yedi. Ali uyudu.";
		System.out.println(text.replace("Ali", "Veli"));
		
		//replaceAll() ve replace() methodlari tamamiyla ayni isi yaoarlar.
		//replace()m methodunda isterseniz tek characterler icin tek tirnak kullanabilirs
		//iniz . tek fark budur.
		
		
		
		
		
	}

}
