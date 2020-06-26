package day17constructors;

public class Constructors01 {
	
	String isim = "Ali Can";
	int yas = 33;

	public static void main(String[] args) {
		//Method ile ,main method ayni class icnde ise sace ismini yazaarak kullanabiliriz
		
		buyume(33);
		isimDegistir("Ayse han");

	}
	
	public static void buyume(int yas) {
		yas++;
		System.out.println(yas);
	}
	
	public static void isimDegistir(String isim) {
		System.out.println(isim);
	}

}
