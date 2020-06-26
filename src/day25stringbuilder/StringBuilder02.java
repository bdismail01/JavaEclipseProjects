package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() atama yapmadan String i degistirmez.
		
		StringBuilder str1 = new StringBuilder("Animals");
		//str1=str1.substring() hata verir .Cunku substring () StringClass indan geldigi icin 
		//String return eder.Halbuki str1 stringbuilding di./
		//mecburen baska bir isme atam yapmaliyiz
		
		//bu hatadan kurtiulamk cin ik yol .var
		
		//1.yol: String Classindan yeni bir String uretip atama yapariz
		String str2 = str1.substring(3);
		System.out.println(str2);
		
		//2.yol: str1.substring() ifadesini direjt system.out.println() icine yazin
		System.out.println(str1.substring(3));
		
		
		System.out.println(str1.substring(1, 4));
		
		//indexOf() methodu belli bir characterin index ini retur eder
		System.out.println(str1.indexOf("m"));
		
		// length() methodu string class indan gelir ve String in uzunlugununreturn eder.
		System.out.println(str1.length());
		
		//charAt() methodu belli bir indexxteki characteri return eder.
		System.out.println(str1.charAt(5));//animals da index 5 l harfidir l return deder.
		
		//insert() methodu istenen index e istenen charactei eklemeye yarar.
		// bu method append gibi StringBuilder i direct degistirir.
		str1.insert(0, "x");
		System.out.println(str1);
		
		//delete () methodu istenen index araligindaki characterleri siler
		str1.delete(0, 1);
		System.out.println(str1);
		
		//2.deleteCharAt() methodu istenen indexteki characteri siler.
		str1.deleteCharAt(6);
		System.out.println(str1);//s harfini silmeli
		
		
		//reverse() methodu string i tersten yazdirir.
		str1.reverse();
		System.out.println(str1);//lamina
		
		//toDString () methodu stringBuilder i string e cevirmek icin kullanilir
		str1.toString();
		System.out.println(str1);//str1 artik String tir.StringBuilder degil.
		
		//StringBuilder java'nin 5. versionunda olusturuldu.
		//StringBuffer 'lar StringBuilder'in esk versionu.
		//StringBuilding'lar daha hizlidir. 
		

	}

}
