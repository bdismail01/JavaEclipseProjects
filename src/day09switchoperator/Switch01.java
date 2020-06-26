package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A bulunca " ilk harf", B harfini bukunca "Ikinci harf"
		// C harfini bukunca "Ücüncü harf", ile
		//D harfini bulunca "Dörduncu harf"
		//if ve switch
		
		char harf = 'A' ;
		
		//1. yol
		
	//
	//	if (harf =='A') {
	//		System.out.println("Ilk Harf");
	//	}else if(harf=='B') {
	//		System.out.println("Ikinci Harf");
	//	}else if(harf=='C') {
	//		System.out.println("Uccuncu Harf");
	//	}else if(harf=='D') {
	//		System.out.println("Dördüncü Harf");
	//	}else {
	//		System.out.println("Bilmiyiorum");
	//	}
		
		//2. Yol
		
		switch(harf) {
		   case 'A':
			   System.out.println("Ilk harf");
			   break;
		   case 'B':
			   System.out.println("Ikinci harf");
			   break;
		   case 'C':
			   System.out.println("Ücüncü harf");
			   break;
		   case 'D':
			   System.out.println("Dördüncü harf");
			   break;
		  default:
			  System.out.println("bil");
		}
		
				

	}

}
