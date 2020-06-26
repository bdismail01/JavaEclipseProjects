package day16owerloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		//Bska bir  class ta urettigimiz object i yeni bir class ta kullnabilriz
		//object in ozelliklerini degistirebiliriz ama bu degisim sadece o ibject te olur
		//Yeni uretilecek object ler ilk object in ozellikleini kullalnir
		Constructor01 hondaAraba01 = new Constructor01();
		System.out.println("Zamli fiyat: " + (hondaAraba01.price + 1000));
		System.out.println("Year : " + (hondaAraba01.year - 1));
		System.out.println(hondaAraba01.make.replace("Honda", "Toyota"));
		System.out.println(hondaAraba01.type.replace("Civic", "Camry"));
		
		
	}

}
