package day24varargsaccessmodifier;

public class Varargs01 {

	public static void main(String[] args) {
		//Varargs : variable argument
		//bir method olusturdugumuuzda argument olarak 
		//istedigimiz kadar argument girmemizi saglar
		
		countNum(5);
		countNum(3,4,5);
		countNum(2,3,4,5,6,7,8,9);
		
		
		sumNums(2,3);
		sumNums(2,4,5,6,7,8,9);
		
		
		printName("Ali");
		printName("Ali","Can" ,"Kahraman");
		

	}
	
	public static void countNum(int... a) {
		System.out.println(a.length);
	}
	
	public static void sumNums(double... b) {
		double sum=0;
		for(double w: b) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	
	public static void printName(String... n) {
		
		for(String w: n) {
			System.out.println(w + " ");
		}
		

	}
	
	
		

}
