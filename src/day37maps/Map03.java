package day37maps;

import java.util.TreeMap;

public class Map03 {

	public static void main(String[] args) {
		/* TreeMap: 1) Ley'lerde null kullanmaya musade etmez ama Value'larda kabul eder.
		 *          2) TreeMap'ler console'da Key'leri natural order'a gore yazdirir.
		 *          3) TreeMAp'ler siraladigi icin yavasdir.
		 
		 */
		
		TreeMap<String, Integer> tMap = new TreeMap<>();
		
		tMap.put("Kanaat",null);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		tMap.put("Bezelye", 7);
		System.out.println(tMap);//Key'leri natural order siraladi
	}

}
