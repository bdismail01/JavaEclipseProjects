package day11stringmethods;

public class StringMethods04 {

	public static void main(String[] args) {
		// valueOf() rakm olan Stringi sayiya donusturur.
		//boylece islem yapabiliriz.
		//valueOf() hem integer hem String icinde var.
		//Integeer icindeki valueOf() string i integer a cevirir.
		
		String paraErkek = "1900";
		String paraKadin = "2000";
		//bu ailenin toplam geliri nedir
		System.out.println(paraErkek + paraKadin);//19002000 bu yapistirma
		System.out.println(Integer.valueOf(paraErkek)+ Integer.valueOf(paraKadin));//3900
		
		int maasErkek = 1900;
		int maasKadin = 2000;
		//maasErkek ve maasKadin sayilarini String edonusturun ve birlestirin
		System.out.println(maasErkek + maasKadin) ;//3900
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadin));//19002000
		
			

	}

}
