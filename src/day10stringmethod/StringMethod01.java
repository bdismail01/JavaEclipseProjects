package day10stringmethod;

public class StringMethod01 {

	public static void main(String[] args) {
		
		//indexOf() method String icindekki charectein yerini belirlemek icin kullanilir
		
		String str1 = "Java World";
		System.out.println(str1.indexOf('v'));// ekran 2 yazdir.Cunku indexler sayimi 0 dan basltir
		System.out.println(str1.indexOf('W'));// ekrana 5 yazdirir.cünkü space bir charecterdir
		System.out.println(str1.indexOf('w'));// java "case sensitive"dir
		System.out.println(str1.indexOf('a'));//ekran 1 yazdirir.           
		                                     //birden fazla kullanilan charecter icin ilk charecterin index ini verir.
      
		//indexOf() diger method 
		System.out.println(str1.indexOf('a',3));//Stringteki ikkinci 'a' charecterinin index ini bulunuz
		                                       //eKrana 3 yazmali
		System.out.println(str1.indexOf('a',5));// Ekrana -1 yazdirir. cunku benim aradigim yerde 'a' yok
		
		
		//"Alamanya" Stringindeki ikinci a charecteini indexini bulunuz.
		String str2 = "Alamanya";
		
		System.out.println(str2.indexOf('a'));// bu birinci a nin indexi==>2
		int idx = str2.indexOf('a');
		System.out.println(str2.indexOf('a',idx+1));// ekran 4 yazmali
		
		//indexOf () methodu 3.versiyonu
		
		String str3= "missisippi";
		str3.indexOf("is");//"is" stringini bukur ve ilk harfin yerini return eder
		                   // ilk harf olan 'i' hafirn index 1i verir
		System.out.println(str3.indexOf("is"));
		System.out.println(str3.indexOf("si"));//ekrana 3 yazmali
		
			
	}

}
