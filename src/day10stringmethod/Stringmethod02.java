package day10stringmethod;

public class Stringmethod02 {

	public static void main(String[] args) {
		// lastIndexOf() methodu aradiginiz charecterin String icindeki son gorunumunun indexini verir
		//lastIndexOf() methodu 1. versiyon
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));//rkrana 6 yazdirir.
		
		System.out.println(str1.lastIndexOf('r'));
		
		//lastIndexOf() ikinci versiyon
		System.out.println(str1.lastIndexOf('i', 7));//ekran 6 yazdirir.ilk 7 index in icnde 'i' harfinin son gorunumunun indexini return eder
		
		//lastIndexOf() 3.methodu
		String str2 ="Rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));// Stringin icinde "ri" nin son görinimu bulacak 
		

	}

}
