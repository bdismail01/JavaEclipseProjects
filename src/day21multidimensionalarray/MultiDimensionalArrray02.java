package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArrray02 {

	public static void main(String[] args) {
		// Multi Dimensional Array olusturup deger atama
		
		int arr[][] = { {1,2}, {3}, {4,5,6} };
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(arr[0][1] + arr[1][0] + arr[2][2]);
		
		//arr arrayndeki tum elelmanlarin toplamin veren prog yaziniz.
//		 int sum =0;
//		 for(int i=arr[0][0]; i<=arr[arr.length-1][arr.length-1]; i++) {
//			 sum = sum + i;
//		 }
//		 System.out.println(sum);
		 
		 int sum = 0;
		 
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 sum = sum +arr[i][j];
			 }
		 }
		 System.out.println("Tum elemanlarin tooplami: " + sum);
	}

}
