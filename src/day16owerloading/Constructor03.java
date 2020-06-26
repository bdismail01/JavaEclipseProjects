package day16owerloading;

public class Constructor03 {
	
	String isim = "Ali Can";
	int yas = 33;
	int kilo = 85;
	String meslek = "Automation Teseter";
	boolean emekli = false;
	
	
	
	Constructor03(){ //bu constructor uretme
		
	}	
		Constructor03(String isim, int yas){ //bu yeni bir constructor uretme
			this.isim = isim;
			this.yas = yas;
				
		
		
	} 
		Constructor03(String isim, int yas, boolean emekli){ //bu yeni bir constructor uretme
			this.isim = isim;
			this.yas = yas;
			this.emekli = emekli;	
		
		
	} 
	public static void main(String[] args) {
		
		Constructor03 insan01 = new Constructor03();// bu object olusturma
		System.out.println(insan01.isim);
		
		Constructor03 insan02 = new Constructor03("Ayhan Yildiz", 56);// bu object olusturma
		System.out.println(insan02.isim);
        
		Constructor03 insan03 = new Constructor03("Ayhan Yildiz", 56, true);// bu object olusturma
		System.out.println(insan03.isim);
		System.out.println(insan03.yas);
		System.out.println(insan03.emekli);

	}

}
