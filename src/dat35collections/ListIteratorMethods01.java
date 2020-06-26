package dat35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		// elemanlari a,b,c olan stringleri olan bir list olusturuunuz
		
		List<String> list = new ArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		//list iterator olusturunuz.
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			System.out.print(element + " ");
			
		}
		
		System.out.println();
		
		while(listIterator.hasPrevious()) {
			Object element = listIterator.previous();
			System.out.print(element + " ");
		}

	}

}
