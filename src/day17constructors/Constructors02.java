package day17constructors;

public class Constructors02 {
	
	
	//buyume () methodu bu class ta degil Constructors01 classinda .
	// *    peki baska class taki bir bilgiyi nasil kullanabilirz
	// o class tan bir tane object olusturmaliyiz. 
	//o object sayesinde istedigimiz methodu kullanabiliriz.
	

	public static void main(String[] args) {
		
		//buyume methodu static oldugundan java object kullanarak buyume() methodunu 
		//cagirmamizi istemez ve kodun altini sari renkli cizer.
		
		Constructors01 obj1 = new Constructors01();
		obj1.buyume(33);
		obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("rabia zeynep");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.artirma(45);
		Constructors03.degistirme("Merhaba Naci");
	   
	}
	
}	