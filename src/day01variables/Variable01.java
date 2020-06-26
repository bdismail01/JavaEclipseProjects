package day01variables;

public class Variable01 {
	
	public static void main(String[] args) {
		
		int maas = 3000;
		
		char harf = 'S';  //charlara deger atamasi yaparken mutlaka tek tirnak kullan
		
		System.out.println(maas); //3000
		System.out.println(harf); // S
		
		boolean isOld = true; // booleean lar icin ssdece true veya false 
		System.out.println(isOld);
		
		byte derinlik = -123;
		System.out.println(derinlik); //123
		
		short sirnakNufus = 28000;
		System.out.println(sirnakNufus);
		
		long hucreSayisi = 1566666777l; // integer sinirini asan rakamlarin sonuna l harfi konmali
	
		System.out.println(hucreSayisi);
		
		double pi = 3.14; // java bütün ondalik keesirle double olarakkabul eder
		System.out.println(pi);
		
		float para = 5.25f; //lari float uretmek icn f kücük ondalik rakam
		System.out.println(para);
		
		String ogrenciIsmi = "Ali Can";
		System.out.println(ogrenciIsmi);
		
	}

}
