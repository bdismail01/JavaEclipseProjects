package day22arraylist;

import java.util.Arrays;

public class OdevSorusu01 {

	public static void main(String[] args) {
		
		
		//arr1 = { {1,2},{3,4,5}, {6} }
		int arr1[][] = { {1,2},{3,4,5}, {6} };
		int arr2[][] = { {7,8},{9,10,11}, {12} };

		
		int sum=0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				sum= sum + arr1[i][j];
				
			}
			
		}	
			System.out.println(sum);
			
		int sum1=0;
		for(int l=0; l<arr2.length; l++) {
			for(int k=0; k<arr2[l].length; k++) {
				sum1=sum1+arr2[l][k];
			}
			
		}
		
		System.out.println(sum1);
		System.out.println(sum+sum1);	
		
		
		

	}

}
