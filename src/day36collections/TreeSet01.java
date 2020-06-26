package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// 1)TreeSet HashSet ile hemen hemn aynidir.
		//   no dublication ,Key-Value yapisi kullanir
		// 2)Farki nedir: TreeSet elemanlarini naturel order 'a gore dizer.
		//   Siralamanin onemli oldugu yerlerde TreeSet Kullanilir.
		// 3)HashSet rastgeele dizer
		//   HAhSet daha hizlidir.
		//   Mesala method isimleri bilgisayardaki ekranda
		//   Amam bir problemi var:yavastir.
		// 4)  Natural order 'a sahip bir Set lazim olunca  
		//            HashSet olusturulur ve
		//            elemanlar eklenir sonra bu HashSet TreeSet'e donusturulur.

		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		
		System.out.println(tSet);
		
		//HashSet olusturup java'nin elemanlari hizli eklemesini saglariz 
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);
		
		//Olusturduugumuz HashSet'i TreeSet constructor'una parametre olarak koyup 
		//TreeSet'e ceviririz, boylréce
		//TreeSet'in elmanlari natural order yapma ozelliginden faydalaniriz
		
		TreeSet<String> tSet1 = new TreeSet<>(hSet1);	
		System.out.println(tSet1);
		
	}

}
