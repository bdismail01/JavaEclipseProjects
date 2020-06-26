package day10stringmethod;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains() methodu bir String in icinde bir character olup olmadigini kontrol eder
		// eger o character String in icinde 
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m"));  //true veya false verir
		System.out.println(str1.contains("kar"));
		
		
		//trim() methodu bir Stringin bas ve sonundaki bosluklari siler "  Ali"==>"Ali" olur..
		// ortadaki bosluklari silmez."  Ali can  " ==>"Ali can" olur
		
		String str2 = "  Ali Can    ";
		System.out.println("trim() kullandiktan sonra:"+str2.trim());
		System.out.println("trim() kullanmadan once:"+str2);
		
		//isEmpty methodu nir String icnde character olup olmadigina bakar
		//character yoksa true, varsa false return eder.
		String str3 = "Ali";
		System.out.println(str3.isEmpty());// false cunku string bos degil
		
		String str4 = " ";
		System.out.println(str4.isEmpty());//false cunku bosluk characterdir
		
		String str5 = "";
		System.out.println(str5.isEmpty());//true cunku character yok
		//isEmpty() true cikarsas length 0 demektir.

	}

}
