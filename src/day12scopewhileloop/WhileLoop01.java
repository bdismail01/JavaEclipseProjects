package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// While => iken demektir
		//Whike i go to scholl==> ben okula giderken
		//WHILE I go to Uskudar, it rained
		
		int num = 0;
		//sayi 4 ten kuuck iken
		while(num<4) {//Parentez icindeki condition true oldugu surece whike loop calisir.
			System.out.println("Ali");
			num++;// bu atiri unututrswniz while loop  sonsuz donguye girer. Unutmamaliyiz.
			
	
		} 
		//while kulllanarak 1 den 10 kadar tam sayilari ekrna yazdirniz.
		
		int num2 =1;
		while(num2<11) {
			System.out.print(num2 + " ");
			num2++;
		}
		System.out.println();
		//while ile 1 den 20 kaar cift sayilari ekrana yazdirniz
		
		int num3 =1;
		
		while(num3<21) {
			if(num3%2==0) {
			System.out.print(num3 + " ");
			}
			num3++;
		}
		System.out.println();
		//while loop kullanarak 5 den 120 kadar 3 e bolunebilen tam sayilari yazdiriniz.
		
		int num4 = 5;
		
		while(num4<=120) {
			if(num4%3==0) {
				System.out.print(num4 + " ");
			}
			num4++;
			
		}

	}

}
