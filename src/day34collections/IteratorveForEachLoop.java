package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorveForEachLoop {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);//x,y,z
		
		Iterator<String> iterator =list1.iterator();
		//hasNext() methodu bir sonraki elaman var mi yok mu diye kontrol eder
		//x,y,z
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		System.out.println();
		
		//for-each kullanarak list1'in tum elemanlarini ekrana yazdiriniz
		
		for(String w:list1) {
			System.out.println(w);//x,y,z
		}
		
		//iterator ile for-each farki:
		//for-each elelmanlar arasinda gecer ama collection 'da degisim yapamyz
		//iterator ile elelmanlar arsida gecer ve collection'da degisim  yapar

		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();//remove () methodu eleman siler.
		}
		System.out.println(list1);
		
		//for-each ile degisim yapmaya calisalim
		for(String w:list1) {
			w= w+ "A";
		}
		System.out.println(list1);
		
		
		
		
		
	}

}
