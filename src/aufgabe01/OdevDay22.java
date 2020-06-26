package aufgabe01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OdevDay22 {

	public static void main(String[] args) {
		// bir array olusturun carpimini for each loop
		
		int arr[][] = {{1,2,3},{5},{6,7,8}};
		
		int x=1;
		for(int[] w :arr) {
			for(int z: w) {
				x=x*z;
			}
			System.out.println(x);
		}
		
		//odev 2:
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(4);
		list.add(5);
		
		
	        	
		int sum1=0;
		for(int w : list) {
			sum1= sum1+ w*w;
		}
		System.out.println("kareler toplami: "+ sum1);
		
		
		//Odev3:iki string array ortek eleman ekrana yazdir
		//yoksa "ortak elman yok" yaz
		
		String arr1[] = {"Ali", "Ahmet","Can"};
		String arr2[] = {"Ali", "zeynep","Ayse"};
		int count=0;
		
		for(String m : arr1) {
			for(String n : arr2) {
				if(m.equals(n)) {
					System.out.println("Ortak elamn: " + m);
					count++;
				}
				
			}
			
		}
		if(count==0){
			System.out.println("Ortak eleamn yok");
		}
		
		
		//odev4: bir string olus , characterleri yukaidan asagi yaz
		
		
		String str = " Hava guzel";
		String arr3[]= str.split("");
		System.out.println(Arrays.toString(arr3));
		
		for(String l : arr3) {
			System.out.println(l);
		}
		
		int arr5[][] = { {1, 2}, {3}, {4, 5, 6} };

		int sum = 0;	

			for(int[] w : arr5) {			

					for(int z : w){

						 sum = sum + z;

					}	

		    }
			System.out.println(sum);


		
		
		

	}

}
