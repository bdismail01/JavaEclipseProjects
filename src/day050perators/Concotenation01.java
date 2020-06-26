package day050perators;

public class Concotenation01 {

	public static void main(String[] args) {
		
		
		String str1 ="Ali"+ "Can";
		System.out.println(str1);
		
		String str2 = "4" + 3;//En az birisi string ise toplama degil concotenation yapilir
		System.out.println(str2);
		
		String str3 = "3" + 4 + 5;//ilk sonuc "34" stringtir sonra 5 eklenir 345
		System.out.println(str3);//345
		
		String str4 = "3" + (4 + 5);//ilk parantez ici yani 9 sonra yapistiri 39
		System.out.println(str4);
		
		String str5 = 3 + 4 + "5";
		System.out.println(str5);//75
		
		String str6 = 2 * 3 + "4" + 6/2;//ilk caarpma 6, sonra 4 yepistir:64, sonra bölme3 yani:643
		System.out.println(str6);//643
		

	}

}
