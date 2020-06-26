package day37maps;

import java.util.Hashtable;

public class Map02 {

	public static void main(String[] args) {
		// HashTable: HAshMAp ile hemen hemen aynidir.
		/*            HAshMAp gibi rastgele yazdirir.
		 *            HashMAp te kullanilan butun methodlarin tamami HAshTablede de kullanilir
		 *  FArklari:
		 *         1)Key ve Value'larda null'a musade etmez.
		 *         2)HAshTable thread safe dir. 
		 *         3)HashTable daha yavastir.     
		 * 
		 */
		
		Hashtable<String, String> hTable = new Hashtable<>();
		
		hTable.put("Dil","Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Ali", "");// "" bu null degildir. Bu hic bir sey'dir.
		//Ayni key degerini kullanirsaniz sion value'yi kabul eder.
		hTable.put("Dil", "Tad alma organi");
		// hTable.put(null, "Agiz");   //Bu Run time error verir.
		// hTable.put("Kanaat", null); //Bu Run Time Error verir.
		
		System.out.println(hTable);
		
		
		

	}

}
