package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue: Queue'ya eklenen elemanlar en sona eklenir, list'ler gibi
		//        Silinen elemanlar en bastan silinir.
		//        [1,2,3] ==> Queue dan silmeye baslagimizda once bor 1 silinir.
		//        Fifo ==> first  in first out. onca giren once cikar.
		
		
		//PriorityQueue elemanlari natuerel order 'a gore dizer
		Queue<String> q = new PriorityQueue<>();
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q);
		
		//remove() methodu kullanalim
		System.out.println("Silinen eleman: "+ q.remove());// 1.Siler, sildigini ekranda gosterir, return eder
		System.out.println("Kalan Queue: "+ q);//KAlan Queue
		System.out.println(q.remove("C"));// Bunu sil dedigim icin bana true verir
		                                  // TAmam yaptim der ve true dondurur.  
		
		//LinkedList elemanlari sizin girdiginiz siraya gore siralar
		Queue<String> qll = new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);//[B,A;C]
		System.out.println("ilk eleman: "+ qll.element());//ilk elemani dondurur.
		System.out.println(qll.poll());//ilk elemani siler ve return eder.
		System.out.println(qll.poll());
		System.out.println(qll.poll());
		System.out.println(qll.poll());
		
		//not: Remove () methodu bos Queue'laer icin kullanilirsa Exception verri.
		//     Poll() methodu bos Queue'lar icin null atar.
		//     Ama ikisi de ayni isi yapar
		

	}

}
