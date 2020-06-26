package day23date;

import java.util.ArrayList;
import java.util.List;

public class LIstAllMethod {

	public static void main(String[] args) {
		// ListaddAll() method iki listi brilestirmek icn kullanilir.
		//index kullanmadan addAll kullanirsaniz bas veya sontarafa eklerseniz
		//istedigimiz index e eklemek icin addAll(index, list) methoduyla olour.
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(11);
		list1.add(12);
		System.out.println(list1);
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);// list1 artik [11,12,13,14,15] oldu
		
		list2.addAll(list1);
		System.out.println(list2);//[13,14,15,11,12,13,14,15]
		
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		System.out.println(list3);
		
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(2);
		list4.add(3);
		System.out.println(list4);
		
		list4.addAll(1, list3);
		System.out.println(list4);
		
		
	}

}
