package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// iki array olusturup bu arraylerin birbirine esit olup olmadigini kontrol ediniz
		//not: iki array esit olabilmesi icin:
		//      1-elemanlar ayni olmasi
		//      2-esit elemanlarin index leri de esit olmali
		
		
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
		
		System.out.println(arr1==arr2);//false cunku reference ler farkli.
			                           //==' adresleri de kontrol etiginden iki array iki object tir
		System.out.println(Arrays.equals(arr1, arr2));//true cunku 
		                               //Arrays.eguals() methodu sadece deerelri ve index i kontrol eder
		
	}

}
