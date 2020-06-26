package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Exception2 {
	
//Checked Exeption'lari (handke etmek icin iki yol var 
	//1.) "throws" keyword 'unu kullanirsaniz cosole'de teknik mesajlar goronor
	// bu yuzden cok tercih edilmez
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		
		
	}

}

//2.) try-cath block kullanmaktir. kullaninca console de teknik mesaj yerine 
//    kendi yazdiginiz mesjlari gorebilirsiniz  bu yuuzden try-cath kullanmak tercih edilr
class ExeptionTryCath{
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosyanin path'i yanlis veya dosya silinmis olabilir");
		}
	}
}
