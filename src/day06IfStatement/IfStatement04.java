package day06IfStatement;

public class IfStatement04 {

	public static void main(String[] args) {
		//String atayin kücük harfle gün ismi ata
		//deger hafta ici günlerinden biri ise hafta ici yazdirin
		//haftasonu ise ekran hafta sonu yazidr
		
		String day = "pazartesi";
		
		if(day.equals("pazartesi")|| day.equals("sali") || day.equals("carsamba") || day.equals("persembe") || day.equals("cuma")) {
			
			System.out.println("hafta ici");
		}
		if(day.equals("cumartesi") || day.equals("pazar") ){
			
			System.out.println("Hafta sonu");
			}
		
		
		
		

	}

}
