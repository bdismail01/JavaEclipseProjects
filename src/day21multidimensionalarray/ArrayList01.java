package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// Array lerde length sabitttir degismez
		//ArrayList lerde length esnektir siz eleman ekledikce List lengthini artitir
		//siz eleman sildikce List length ini azaltir.
		
		
		//List<String> list01 = new List<>(); olmaz
		//ArrayList<String> list01 = new List<>(); olmaz
		//ArrayList<String> list01 = new ArrayList<>(); olur ama assagidaki daha pratik
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);
		
		//List e eleman eklemek icin add() methodu kullanilir
		list01.add("Ali");
		System.out.println(list01);
		
		list01.add("Can");
		System.out.println(list01);
		
		list01.add(1, "Veli");//ikinci add() methoduyla araya koyabiliriz.
		System.out.println(list01);
		
		list01.add(0, "HAn");
		System.out.println(list01);
		
		list01.add(2, "Kemal");
		list01.add("Aysel");
		System.out.println(list01);
		
		//list01 in eleman sayisi ekrana nasil yazdirilir.=>size() methoduyla
		System.out.println("Elelman sayisi:" + list01.size());//6
		
		
		
		
		
		
		

	}

}
