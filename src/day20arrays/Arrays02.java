package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// bir integer array in elemanlarini kucukten buyuge diiziniz
		//ve ekrana iki durumu da yaz
		
		int arr[] = {2, 11, 0, 23, 7};
		System.out.println(Arrays.toString(arr));
		
		//Arrays.sort() methoduna parametre olarak array in ismi yazilirsa
		// o array in elemanlari kucukten buyuge (Ascending order, naturel order) siralamis olur
		
		Arrays.sort(arr);
		System.out.println("siralamadan sonre: " + Arrays.toString(arr));  
		
		
		char arr1[] = {'a', 'd', 'c','A'};
		System.out.println("siralamadan once: " +Arrays.toString(arr1) );
		//buyuk harflerin ASCII kodlari kucukten daha azdir, yani oncce buyukler yazilir.
		
		Arrays.sort(arr1);
		System.out.println("siralamdan sonra: " + Arrays.toString(arr1));
		
		
		//Stringlerden olisan bir Array olusturun ascending order 
		
		String arrStr[] = {"Ali", "Ahmet", "65","Beyza"};
		System.out.println("Siralamadan once: " + Arrays.toString(arrStr));
		
		Arrays.sort(arrStr);
		System.out.println("siralamadan sonra:" + Arrays.toString(arrStr));
		
		//soru: boolean bir array ascending order
		
		boolean arrB[] = {true, false, false};
		System.out.println("siraamadan once: " + Arrays.toString(arrB));
		
		//booelanlar icin sort methodu kullnailmaz.

	}

}
