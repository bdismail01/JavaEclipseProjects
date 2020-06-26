package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylLIst02 {

	public static void main(String[] args) {
		// toArray() methodu List i array e cevermek icin kullanilir
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		//1.yontem: toArray() methodunu icinde parametre olarak new String[0]kullaniniz
		String arr[] = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		//2.yontem; Olusturdugumuz array in data type ni Object olarak secin.
		//Object class, butun class larin parent idir.yani Object xlass artak ata dir.
		//Object xlass parent i olmayan tek class tir.
		//String Object class in child i oldugundan data type olarak bazan
		//String yerinre Object kullanilir.
		Object arr1[] = list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		
		
		//asList() methodu arrayleri list e cevirmek icib kullaanilir.
		//asLIst () merhodu parametre olarak arrayin ismini kulllanir.
		
		String arr2[] = {"Aliye","Canan"};
		
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);
		
		//list1.add("Emine");Bunu yapamazsiniz.RUnTime Error veir. Array i list e cevirince add(), remove () yapayiz artik.
		//yani aritk bu list array den cevrildigi icin o da array gibi sabit olur artik.
		
		

	}

}
