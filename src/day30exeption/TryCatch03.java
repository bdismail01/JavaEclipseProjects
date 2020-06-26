package day30exeption;

public class TryCatch03 {

	public static void main(String[] args) {
		
		System.out.println(exceptions());

	}
	@SuppressWarnings("finally")
	public static String exceptions() {
		String result = "";
		String v = null;
		
		try {
			try {
				result = result + "before";
				v.length();
				result = result + "after";
			}catch(NullPointerException e) {
				result = result + "catch";
				throw new RuntimeException();
			}finally {
				result = result + "finally";
				throw new Exception();
			}
			
		}catch(Exception e) {
			result = result + "done";
		}
		return result;
	}
	// throw ile throws arasindaki fark nedir
	
	// 1) throw method body icinde kullaniliir
	//    throws method parantezi ile curly brace arasina yazilir
	// 2) throw 'u body icinde Exception almak istedigimiz yerde kullanabilriz.
	//    throws ise mecburen method isminden sonra bir kere kulllanilir
	// 3) 1 throw sadece bir Exception uretebilir, 
	//    throws ile birden fazla Exception urertebilirsiniz
	//    yani "throw NullPointerException, ArithmeticException" mumkun
	// 4) throw icin syntax ==> throw new nullPointerExeption;
	//    throws icin syntax=> throws nullPointerException

}
