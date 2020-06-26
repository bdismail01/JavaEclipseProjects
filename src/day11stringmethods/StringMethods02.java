package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// substring() methodu bir Stringin belli bir bolümünü keesip almaya yarar.
		
		String str1 = "java calisana kolaydir";
		
		System.out.println(str1.substring(5));//calisana kolaydir. 5.indexten itaberen dahil alir.
		System.out.println(str1.substring(8));//isana koalydir
		
		//substring 2.versiyon
		System.out.println(str1.substring(5, 13));//ilk index dahil 2.index dahil degil
		                                          //ilk index i ekranda gorürsünüy 2.index ekrsnda gozukmez
		
		System.out.println(str1.substring(6, 12));//alisan
		System.out.println(str1.substring(6, 6));// ekranda birsey gozujmez. ikinci 6 gozokmeyecegi icin
		
		
	}

}
