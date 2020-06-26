package day18statickeyword;

public class Static01 {
	
	// Eger bir variable olustururken hesap yapmamiz gerekirse
	//"static block" olusturmak iyidir.
	//bu isimleri static block icine yazmak daha iyidir.
	//"static block" variable lara deger atamak icicn de kullanilir
	//static block" class in icinde ve butun methodlarin disinda ve 
	//cintructor larin disinda oolusturulur
	//static block class olustruldugu zaman heemn olusturlur
	//static block tum methodlar dan mainmethod dahil ve constructorlardan once calistirilir.
	
			
			
			static int en = 12;
			static int boy = 10;
			static int alan;
			static int yaricap = 4;
			static double pi;
			
			static {
				alan = en*boy;
				pi =3.14;
			}
			

	public static void main(String[] args) {
		
		
	}
	static class AltClass{
		
	}
	// sattic class olusturulabilir ama alt classlar (inner class) static calss olabilir.
     //ust classlar static olamaz.
	
}
