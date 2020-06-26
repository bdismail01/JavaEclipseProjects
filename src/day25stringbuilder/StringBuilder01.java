package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder  class i string uretmeye ve uretilen Stringleri manipule etmeye yarar.
		// String lere atama yapmadan degisiklik yapmanin yolu StringBuilder dir
		//String ler atamasiz degistirilemdigi icin "immutable" denir.
		
		
		String str = "Ali";
		str.substring(1);// atama da yapilabiöir: str=str.substring(1); o zaamn degisir.
		                 //ali degisir ve li olur.
		System.out.println(str);
		
		
		
		//StringBuilder Class ini kullanarak string urettigimizde degisiklik  
		//ilk String uzerinde yapilir.atama yapmaya gerek kalmaz.
		//StringBuilder degisimi yansittigi icin "mutable" denir.
		
		//1.yol:
		StringBuilder strBld = new StringBuilder("Ayse");
		strBld.append("Can");//append () methodu String e yeni bir 
		                     //String eklemek icin kulllanilir
		
		System.out.println(strBld);//ayse can
		
		//2.yol:
		StringBuilder strBld2 = new StringBuilder();//parametre yazmazsak bos bir String uretmis oluruz
		strBld2.append("Ali Can");//Bos string e "Ali Can " ekledik
		 
		
		//3.yol:
		StringBuilder strBld3 = new StringBuilder (7);//uzunlugu 7 character olan bir tring urettim
		
		strBld3.append("Ali");
		strBld3.append("Kahraman");//fazla character yazinca stringBuilder kendini buyutur.
		
		
	}

}
