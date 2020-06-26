package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		// bir methodu main methodun icinden cagirmak icin "static" yazm<liyiz
		//  main methodun disinda methodlar olusturup main methodun icine cagirabiliriz
		
		System.out.println(toplama(11,15));//26
		System.out.println(carpma(13,5));//65

	}
	//method parantezini icnde olusturulan variable lere "parametre" enir
	//Methodu cagirirken method parantezini icine yazikan degerlere "argument" denir.
	// parametre nin data type ile argument in data type ayni olmali
	
	public static int toplama(int num1,int num2) {
		return num1 +num2;
	}
	
	public static int carpma(int num1, int num2) {
		return num1 * num2;
	}

}
