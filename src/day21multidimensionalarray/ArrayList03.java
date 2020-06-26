package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["ALi", "Can","Ayse", "Ali"]
		
		List<String> list01 = new ArrayList<>();
		
		list01.add("Ali");
		System.out.println(list01);
		
		list01.add("Can");
		list01.add("Ayse");
		list01.add("Ali");
		System.out.println(list01);
		
		list01.remove("Ali");
		System.out.println(list01);//Birden fazla ayni eleman varsa ilkini siler.
		
		
		
		list01.remove("Kemal");
		System.out.println(list01);// Remove() object methodu listede olmayan elemanlar icin hata vermez
		                           //remove() index li olanlarda olmayan icin hata verir 
		
		System.out.println(list01.remove(0));// bu "can" elemanini diler ve ne sildigini (can) ekrana yazar
		System.out.println(list01.remove("Ali"));
		System.out.println(list01.remove("Kemal"));
		
		//ayse yi degistirmek istersem set() methodu kullanilir.
		list01.set(0, "Aysegul");
		System.out.println(list01);
		
		list01.add("Kenan");
		list01.add("Zeynep");
		
		System.out.println(list01);
		
		list01.clear();
		System.out.println(list01);
		
		
		int arr[][] = { {1, 2}, {3}, {4, 5, 6}};

		int x=1;

		for(int i=0; i<arr.length; i++) {

		              for(int j=0; j<arr[i].length; j++ ) {

						x = x*arr[i][j];

					}

		}
		System.out.println(x);

	}

}
