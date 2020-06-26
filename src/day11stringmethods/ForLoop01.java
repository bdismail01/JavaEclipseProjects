package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// 6,5, 4,3,2,0, -1 yi ekrana yaziran vir looop olusturn
		
		for(int i=6; i>-2; i--) {
			System.out.println(i);	
		}
		
		
		
		//3,4,5,6,7 sayilarini ekran yazan loop olusturunuz.
		
		for(int i=3;i<8; i++) {
			System.out.println(i);
		}
		
		// ilk 100 sayma sayisini 1 den 100 e kadar ekran yan yana yazan ve arlarina bosluk koyan programi for loop kullnarak yaz
		
		for(int i=1; i<=100; i++) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		
		// ilk 100 sayma sayisini ekran yan yana yazan ve arlarina bosluk koyan programi for loop kullnarak yaz
		
		for(int i=100; i>0; i--) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		
		//ilk 50 cift sayma sayisini ekran yazdiran for loop olusturunuz
		//2,4,6.....100
		
		for(int i=2; i<101; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//ilk 50 tek sayma sayisini loop yazdir
		//1,3,5...99
		
		for(int i=1; i<100; i=i+2) {
			System.out.print(i +" ");
		}

	}

}
