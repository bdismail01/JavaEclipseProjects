package day16owerloading;

public class OverLoading01 {

	public static void main(String[] args) {
		// iki sayinin toplamini ekrana yazdiran bir metod oolustutun
		
		
		
		toplam(2,3);
		toplam(7);
		toplam(2.3,4);
		toplam(3,5);
	
	}
	//methodun body kisminidegistirmek yeterli degil
	//overloading yaoma yontemleri
	// 1-parametrelerin sayisini degistirerek ayni iisimli methodlar olusturulabilir
	// 2-parametre sayisini degistirmeden herhangi bir parametrenin data type ni
	// degistirerk de ayni isimli methodlar olusturabilriz
	// birebir ortusen yoksa auto widening e gore kullanabilecegi varsa onu kullnair
	// yoksa hata verir
	// 3-farkli data type olan parametrelerin yerlerini degistirerek de
	//ayni isimli methodlar olusturulabilir
	
	//normal yontem:
	public static void toplam(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	//metdod 2:
	public static void toplam(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	//method 1:
	public static void toplam(int num1) {
		System.out.println(num1 + num1);
	}
	//method 3:
	public static void toplam(int num2,double num1) {
		System.out.println(num1 + num2);
	}
	
	


}
