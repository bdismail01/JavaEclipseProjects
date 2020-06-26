package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "Ali Xan okula basladi";
		
		String kelime[] = str.split(" ");
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayisi: " + kelime.length);
		
		
		String str2 = "Kahramanmaras";
		
		String harf[] = str2.split("");
		
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayisi: " + harf.length);
		

	}

}
