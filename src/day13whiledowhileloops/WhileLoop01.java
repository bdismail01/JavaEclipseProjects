package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// while ile ilk 5 sayma sayisinin toplamini ekrana yazdirin
		
		int sum =0;
		int num = 1;
		while(num<6) {
			sum = sum + num;
			num++;
			
		}
		System.out.println(sum+" ");

	}

}
