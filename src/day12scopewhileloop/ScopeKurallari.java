package day12scopewhileloop;

public class ScopeKurallari {
    int num;//Class Variable
	public static void main(String[] args) {
		// Scope kurallai

	}
	
	public void toplama() {
		int num1 =12;
		System.out.println("Toplama");
	}
	
	public void carpma() {
		System.out.println("Carpma");
	}

}

//1.kural: Class in icinde , methodlarin disinda olan variabke leri
//butun methodlar kullanabilirler. bu variablelere "Class Variable" veya "Instance Variable"denir
//Class variable lere deger atamasi yapmayzsak Java onlar default degerler verir
//Tüm sayilar icin default olarak "0= degerini verir.


//2.Kral: Bir method icinde olusturukan variabkeker sadece o methodun icinde kullanilir.
//o method un disindaki methodlar o variBLE YI kullanamazlar.
//Method icindeki bu variablelere "Local Variable2 denir
//Bodx icinde olusturrulan variablelere deger atmak zorundayiz.


//3.kural:  Methodlarin parentezlero icinde olusturulan variableler
//sadece o methodlarin bodyleri icnde kulllanilablir.
//bu Variable lere de "Local Variable " denir
//parantez icindeki variablelere deger atamasi yapmayiniz.


//4.kural:bir variable yi kullanmaya baslamadan once tanimlamaliyiz.
//once num = num + 2 sonra int num = 12; diyemeyiz.
//ince int num=12; sonra num = num +2 demeliyiz.





