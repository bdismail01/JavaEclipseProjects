package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olusturup ismini list01 yapalim
		//list ler data type olarak primitive leri kabul etmez
		//primitive leri non primitive yapmak icin wrapper class lari kullaniriz.
		
		List<Integer> list01 = new ArrayList<>();
		
		//bu listin icinde eleman olup olmadigini kontrol ediniz. isEmpty () methodu
		//bos ise true dolu ise false return eder.
		System.out.println(list01.isEmpty());
		
		//bu list e bir eleman ekleyiyn
		
		list01.add(123);
		System.out.println(list01.isEmpty());
		
		//List ten eleman silmmek. remove() methodu kullanulir.
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		list01.remove(1);//index i 1 olan elemani siler.
		System.out.println(list01);//ilk 124 gitti.
		
		//123 sil
		list01.remove(0);  //bu index kullanilan remove ilk remove
		System.out.println(list01);//indexi 0 olan elemanin siler.
		
		list01.remove(list01.size()-1);
		System.out.println(list01);

	}

}
