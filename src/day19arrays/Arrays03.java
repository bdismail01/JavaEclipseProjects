package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//elemanlari 1,2,3,4,5 olan bir int array olustur
		//bu array de 3 elemanin olup olmadigini kontrol edin 
		//3 varsa "3 vardir" yoksa "3 yok2 yazdirn.t
		
		
		//1.yol: Array olusturup eleman eklemek icin 
		
		/*int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		//2.yol: Array olusturup eleman eklemek icin
		
		int arr[] = {1, 2, 3, 4, 5};
		
		int count = 0;
		
		for(int i =0; i<5; i++){
			if(arr[i]==3) {
				count++;
			}
		}
			if (count>0) {
				System.out.println(count+ " tane 3 var");
			}else {
				System.out.println("3 yok");
			}
		
		char arr1[] = {'a','b','c','d'};
		
		int count1 = 0;
		
		for(int i=0; i<4; i++) {
			if(arr1[i]=='b') {
				count1++;
			}
		
		}
		if(count1>0) {
			System.out.println("b var");
			
		}else {
			System.out.println("b yok");
		}
		
		
		
		

	}

}
