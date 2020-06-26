package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// bir array icinde  bir elemanin olup olmadigini kontrol ediniz;
		//binarySearch() methodu bu is icin kullanilr
		//Onemli Not:  binarySearch () methodunu kullanmadan once sort() mmethodunu 
		// kullanmak zorundayiz.
		
		
		int arr[] = {1, 5, 2, 5, 3};
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 3));//indexe bakar
		
		System.out.println(Arrays.binarySearch(arr, 5));//indexe bakar
		
		//binarySearch () methodu olmayan elemanlar icin nefgativ sayilar verir.
		//var olsaydi kacinci elelman olurdu anlaminda dir.
		System.out.println(Arrays.binarySearch(arr, 6));//eleman sayisina bakar


	}

}
