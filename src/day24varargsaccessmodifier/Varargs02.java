package day24varargsaccessmodifier;

public class Varargs02 {

	public static void main(String[] args) {
		// Varargs in yanlis kullanimlari
		
		//kural 1: Varargs her zaman sonparameter olmalidir
		// cunku girlen her deger varargs in icine duser.ikinciye deeger vermeyiz
		
		
		valueChar("Character: ",'a');
		valueChar("Character: ",'a', 'b');	
		
		product(1,2,3,4);
		
		
	}
	
	public static void valueChar(String s,char... c) {
		for(char w: c) {
			System.out.print(s);
			System.out.println(w);
		}
	}
	//kural 2: parametre oarak birden fazla varargs kulllanamazsiniz.
	public static void product(int... x) {
		int product=1;
		for(int w: x) {
			product = product*w;
		}
		System.out.println(product);
	}

}
