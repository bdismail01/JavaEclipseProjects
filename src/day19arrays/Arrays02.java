package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// 4 elemanlii char bir array oluturun , bu array e elemanlar yerlestirin
		//tum elemanlari for dongusu ile ekrana yazdirin
		
		char arr2[] = new char[4];
		
		arr2[0] = 'a';
		arr2[1] = 'b';
		arr2[2] = 'c';
		arr2[3] = 'd';
		
		
		for(int c =0; c<4; c++) {
			System.out.println(arr2[c]);
		}
		System.out.println(arr2[3]);
		//Array in length ini bulamak icin ""arr2.length" yazmak yeterlidir.
		// Stringler de de length methodu kullnallir ama Stringler deki () parantezlidir.
		//Arraylerde length parantezsiydir.
		
		System.out.println(arr2.length);//4
		
		//Arrray deki sonelemani bulmak icin length kullaniniz.
		System.out.println(arr2[arr2.length-1]);

	}

}
