package dat35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		//Linked list' de head haric her eleman icin bir data bir pointer vardir
		//head sadece pointer#i vardir
		//her elelmanin pointer'i bir sinraki elelmani gosterir,
		//son elelmanin(tail) pointer'i  Null gosterir
		//Linjed list elelman ekleme ve ciakrma islemlerinde basarilidir.
		
		
		// Linked list object 'i olusturunuz
		
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		System.out.println(linkList);//[mark,amanda,john, ann,pamela]
		
		linkList.remove(2);
		System.out.println(linkList);
		
		linkList.removeFirst();
		System.out.println(linkList);
		
		linkList.removeLast();
		System.out.println(linkList);
		
		linkList.add(1, "Ali");
		System.out.println(linkList);
		
		linkList.addFirst("Kemal");
		System.out.println(linkList);
		
		linkList.addLast("Zeynep");
		System.out.println(linkList);
		
		linkList.set(1, "Ajanda");
		System.out.println(linkList);
		
		
		LinkedList<String> linkList2 = new LinkedList<>();
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList.addAll(linkList2);
		System.out.println(linkList);
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);
		
		linkList.addAll(3, linkList2);
		System.out.println(linkList);
		
		
		System.out.println(linkList2.contains("Can"));
		
		linkList2.clear();
		System.out.println(linkList2);//[]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
