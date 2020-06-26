package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// 
		// integer array olusturalim/
		//elemanalr icin index kullanmaliyiz
		//yazdrirken sadece array ismini yazarsak adreisni yazdirir
		int arr1[] = new int[5];
		System.out.println(arr1); //adreisni yazdirir
		System.out.println(arr1[3]); //index i 3 olan elemani ekrana yazdirir..
		
		arr1[0] = 12;
		arr1[1] = 15;
		arr1[2] = 20;
		arr1[3] = 25;
		arr1[4] = 30;
		
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		//array deki elemanlari ekrana yazdrimak icin for dongusu kullanin
		
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
			
			
			
		//Array de olamyan index edeger atamasi yaparsaniz Run Time Error alinir
		//ArrayIndexOutOfBoundsException aliriz.
			
		}
		

	}

}
