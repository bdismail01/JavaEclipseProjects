package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet01 1) tekrarli elelman kullanimina (dublication)'a izin vermez
		//           2)Key-value yapisini kulllanir. Key'ler ve value'lar Hashset icin unique'dir
		//           Normalde key'ler her zaman unique dir.value'ler ise
		//           hem unique olabilir hem olmayabilir
		//          * kullanilan class HAshSet ise Value unique'dir.
		//          * ArrayList ise unique olma zorunlulugu yoktur.
		// her bir key icin ayri bir value varsa HashSet kullanilir.
		
		HashSet<String> hSet = new HashSet<>();
		//List'lerde add methodu hep yeni elemani sona ekler ama
		//HeshSet'lerde boyle bir zorunluluk yok
		//HashSet'ler elemanlari rastgele ekler bir kural yoktur.
		//
		
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Ali");
		hSet.add("Grape");
		hSet.add("Fig");
		hSet.add("Appel");//HashSet ikinci appel eklersek error kabul etmez.Error almayiz 
		                  //iknci birncinin ustune yazar.gorunuen ikinci eklenendir.
		System.out.println(hSet);
		
		System.out.println(hSet.hashCode());
		

	}

}
