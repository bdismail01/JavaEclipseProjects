package day30exeption;

public class TryCatch01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 2;
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {  // istedigimiz kadar catch yazabiliriz 
			                             //ama yukardaki asagidakinin chld i olmali
			System.out.println("Sifir ile bolme yapilamaz");
		}finally {       //finally{} block exeption olsa da olmasa da  her zaman calisir.
			             //try-catch block tan sonra kullanilir.
			System.out.println("Isleminiz bitmistir");
		}
		
		//Interview: final, finally, finalize keyword' lerini farki nedir?
		
		/*
		 * finally{} =>try-catch block'tan sonra kullanilr
		 *             Exeption olsa da olmasa da calisir
		 * final==>Variabl e 'larda final kullanilirsa, o variable 'nin deeri degistirilmez. 
		 *          Mesela "final pi sayisi yapilinca degeeri degistirilmes" gibi 
		 *          final String code=POS; gibi syntex
		 *          methodlarda final kullanilirsa o methodun body kismi degistirilmez
		 *          dolayisiyla overriding yapilamaz
		 *          
		 *          class larda fianl kullanilirsa , o class extends olmaz
		 *          public final class Animal{}==> public class Dog extends Animal{} yapilamaz
		 *          
		 * finalize() ==> finaloze() methodu, GArbage Collector' in 
		 *            imha edecegi datalari imha edilfcek hale getirir.          
		 *          
		 */
		
		

	}

}
