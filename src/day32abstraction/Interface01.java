package day32abstraction;

public interface Interface01 {
	//class'a benzer ama class degildir.
	//interface icine concrete method yazarsaniz compile time errror alirsiniz.
	// interface icine ancak abstract methodlar konulabilir.
	
	
	
	public void add();// method syntax 'ine abstract keyword  yazmadik 
	               //cünkü zaten abstract olmak zorunda oldugu icin kullanmasanniz da olur
		
	public abstract void subtract();
	
	//interface de veriable'ler mutlaka; public, static, final olamli ve
	//mutlaka initialize(deger atanmali) edilmelidir.
	
	public static final int a = 12;
	
	int b =11;            //  bu sekilde de olur.
	public int c =13; 
	final int d = 15;
	static int e = 16;
	// biz public static final yazmasak da olur. 
	//interface bunlari public static final otomatik yapar 

}
