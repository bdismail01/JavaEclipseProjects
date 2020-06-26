package day18statickeyword;

public class ThisKeyword {
	
	int x = 12;
	static int y = 13;
	
	ThisKeyword(int x){
		//constructor larin icinde veriablelerin deger degistirmek iicn kulllanilir.
		//THIS kullanidigim zaman icinde bulundugum class daki 
		// instance veya static variable lere ulasmak istiyorum demektir.
		// this() icinde bulundugunuz class daki parametresiz constructor u cagirmak icin kullanilir.
		//this() kullanilacaksa ilk satira yazilmalifir.Aksi halde compile Time error verir.
		this("ali");
		this.x = x;
		System.out.println("Parametreli Constructor");
		
		
	}
	
	ThisKeyword(){
		System.out.println("Parametresiz Constructor");
	}
	
	ThisKeyword(String str){
		System.out.println("String parametreli constructor");
	}

	public static void main(String[] args) {
		
		ThisKeyword obj1 = new ThisKeyword(15);
		System.out.println(obj1.x);//15
		
		ThisKeyword obj2 = new ThisKeyword(21);
		System.out.println(obj2.x);
		
	}

}
