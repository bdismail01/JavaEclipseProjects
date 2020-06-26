package day03oparators;

public class TypeCasting01 {

	public static void main(String[] args) {
		// Kücük data tipini buyuk data tipine jaava otomatik olarak yapar.
		
		byte by = 101;
		int sayi = by;
		System.out.println(sayi);
		
		int sayi2 = 53;
		byte by2 = (byte)sayi2;
		System.out.println(by2);
		
		double sayi3 = 23.9;
		int by3 =(int)sayi3;
	    System.out.println(by3);
	    
	    float sayi4 = -23.9f;
	    short by4 = (short)sayi4;
	    System.out.println(by4);
	    
	    double sayi5 = 4.8;
	    double sayi6 = 1.4;
	    double sonuc = sayi5 / sayi6;
	    System.out.println(sonuc);
	    
	    int sonuc2 = (int)(sayi5 / sayi6);
	    System.out.println(sonuc2);
	    
	    int sayi7 = 5;
	    int sayi8 = 3;
	    
	    int sonuc3 = sayi7 / sayi8;
	    System.out.println(sonuc3); // Yuvarlamiyor sadece tam kismi aliyoruz.
	    
	    int sayi9 = 556;
	    byte by5 = (byte)sayi9;
	    System.out.println(by5); //normalde byte da 256 sayi var siniri gecen kismi eksi olark yazar
	    
	    
	    

	}

}
