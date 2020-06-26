package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// eguals() methodu iki listin birbirine esit oluo olmadigini kontrol eder
		//esit ise true, degilde false return eder
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));//elemanlar ayni mi diye bakar sayisi esit mi diye degil.
		
		
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));//false cunku eleamnlarin sirasi da ayni olmali
		//eguals() methodunda true almak icin iki list birbirinin koyasi olmalidir.
		

	}

}
