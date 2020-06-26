package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque: Double Ended queue (Iki uclu queue)
		// Queue'larda ekleme sona silme bastan yapilir
		// Deque kullanirsaniz eklemeyi ve silmeyi hem bastan hem sondan yapilabilr.
		// FIFO var bunn yaninda LIFO da var (Last in First out)
		// Queueu'lara eleman olarak null eklenebilr
		//  ama Deque'lara null eleman olarak eklenmez
		// Deque resizable'dir yani kapasitesi degistirilebilir.
		
		Deque<String> dg = new LinkedList<>();
		
		dg.add("Son1");
		dg.addFirst("BAs1");
		dg.addLast("Son2");
		dg.push("Bas2");// En basa ekleme yapar
		dg.offer("Son3");// sona ekler
		dg.offerFirst("Bas3");
		dg.offerLast("Son4");
		
		System.out.println(dg);
		
		// pop() methodu Deque'lar da bastaki elemani siler
		//               ve bastaki elemani return eder.
		System.out.println(dg.pop());// BAstan siler
		System.out.println(dg);
		
		System.out.println(dg.removeLast());// Son4 sondan siler
		System.out.println(dg);
		
		System.out.println(dg.removeFirst());// ilki siler sildigini ekrana yazdirir
		System.out.println(dg);
		

	}

}
