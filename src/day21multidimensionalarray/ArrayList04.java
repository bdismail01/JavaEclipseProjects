package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// 
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		//list de eleman olarak b var mi ?
		System.out.println(list.contains("B"));// Eger varsa true yoksa false verir
		
		//lst de eleman olarak "z" var mi?
		System.out.println(list.contains("Z"));
		
		//list deki elemanlari alfabetij siraya koyunuz,
		//collection ==>bir araya getirilmis parcalar demektir.
		//collection bir class tir.
		//Bir listedeki elemanlari alfabetik siraya (naturel order) dizmek icin
		//Collections.sort() methodu kulllanilir.Argument olarak list in adini kullaniriz
		
		
		Collections.sort(list);
		System.out.println(list);

	}

}
