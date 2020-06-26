package day17constructors;

public class Constructors03 {
	
	//Bir variable veya method static olarak olusturulmus ise o variableye veya methoda 
	//olusturmadan sadece class ismini kullanarak ulasabiiriz
	
	static String ad = "Ali Can";
	static int kilo = 33;

	public static void main(String[] args) {
		

	}
	
	public static void artirma(int kilo) {
		kilo++;
		System.out.println(kilo);
	}
	
	public static void degistirme(String isim) {
		System.out.println(isim);
	}

}
