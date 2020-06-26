package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den kücük 3 un kati olan sayma sayilarini ekrana yan yana yazdiran for loop olusturun
		
		for(int i=3; i<100; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//ilk 5 sayma sayisinin toplamini veren program for loop ile yaziniz.
		//1,2,3,4,5
		//int sum=0 0+1=1 ,,,1+2=3,,,3+3=6...6+4=10,,,,,10+5=15
		
		int sum = 0;
		for(int i=1; i<6; i++) {
			sum = sum + i;
		}
		System.out.println("toplam: "+ sum);
		
		// 10 dan buyuk ilk uc sayma sayisini toplami veren for looop yaziniz
		
		int sum2 = 0;
		for(int i=11; i<14; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("toplam: "+sum2 );//36
		
		//20 den buyuk ilk 5 sayma sayisinin toplamini vern for loop olusturnuz
		
		int sum3 = 0;
		for(int i=21; i<26; i++) {
			sum3 = sum3 + i;
		}
		System.out.println("toplam: "+sum3);//115
		
		//ilk 50 sayma sayisinin toplamini veren for loop olusturunuz
		
		int sum4 = 0;
		for(int i=1; i<51;i++) {
			sum4 = sum4 + i;
		}
		System.out.println("Toplam: "+ sum4);//1275
		
		//5 ile bolunebilen 100 den kucuk sayma sayilarini toplamini vern for loop olustur
		
		int sum5 = 0;
		for(int i=5; i<100;i+=5) {
			sum5 = sum5 + i;
		}
		System.out.println("toplam: "+ sum5);

	}

}
