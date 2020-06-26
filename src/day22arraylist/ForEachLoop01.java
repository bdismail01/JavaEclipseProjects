package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// For EAch loop, for loop un ust versionudur.
		//diger adi "Enhanced(zenginlestrilmis) For Loop" dir.
		
		int arr[] = {12,21,13,43};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===");
		//for each loop kullanarak elemanlari ekrana yazdir.
		
		for(int w :arr) {
			System.out.println(w);
		}
		
		//String iceren bir array olousturun elemanalrini yan yana bosluk koyarak 
		//for each loop ile ekrana yazdirn
		
		String arr2[] = {"Ali", "Can", "Eve Gel"};
		for(String w:  arr2) {
			System.out.print(w+ " ");
			
		}
		
		int arr3[] = {12,13,14};
		int sum=0;
		for(int w:arr3) {
			sum = sum + w;
		}
		System.out.println(sum);
		
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(21);
		list.add(33);
		list.add(23);
		System.out.println(list);
		
		int sum1= 0;
		for(int w:list) {
			sum1 = sum1 +w;
		}
		System.out.println(sum1);
		
		//{{1,2}{5}{6,7,8}} toplam
		int arr4[][]= {{1,2},{5},{6,7,8}}; 
		int sum2 = 0;
		
		for(int[] w :arr4) {
			
			for(int z : w) {
				sum2 = sum2 +z;
			}
		System.out.println(sum2);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
