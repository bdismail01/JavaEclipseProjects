package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// veri
		
		String str = "verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		str = str.replace(" ", "");
		String ch[]= str.split("");
		
		System.out.println(Arrays.toString(ch));
		System.out.println("character sayiyni bulunuz: " + ch.length);
		
		
		//veya;
		
		String str2 = "verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		String kelime[] = str2.split(" ");
		int bosluk = kelime.length-1;
		System.out.println(bosluk);
		
		String character[]  = str2.split("");
		System.out.println(character.length-bosluk);
			

	}

}
