package dat35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		// Elemanlari a,b,c olan list olusturun
		//ve listIterator kullanrak bu elemanlari  AW,BW,CW ye donusturun
		
		List<String> list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()) {
			Object element = lit.next();
			lit.set(element+"W");
			
		}
		System.out.println(list);
		

	}

}
