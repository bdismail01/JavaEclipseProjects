package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullanicidan ay ismi grisin
		// program kacinci ay oldugunu yazdin
		//buyuk harf kucuk harf icin
		//yanlis ay girerse "Gecerli ay giriniz"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ay ismi girniz");
		String ay = scan.nextLine();
		ay=ay.toLowerCase();//toLowerCase() stringleri kücük harfe cevirir
		
		
		switch (ay) {
		
		
			
		case "ocak":
			System.out.println("1. ay");
			break;	
			
		case "subat":
			System.out.println("2. ay");
			break;	
		case "mart":
			System.out.println("3. ay");
			break;	
		case "nisan":
			System.out.println("4. ay");
			break;
		case "mayis":
			System.out.println("5. ay");
			break;	
		case "haziran":
			System.out.println("6. ay");
			break;	
		case "temmuz":
			System.out.println("7. ay");
			break;	
		case "agust":
			System.out.println("8. ay");
			break;	
		case "eylül":
			System.out.println("9. ay");
			break;
		case "ekim":
			System.out.println("10. ay");
			break;	
		case "kasim":
			System.out.println("11.ay");
			break;	
		case "aralik":
			System.out.println("12. ay");
			break;
			
		default:
			System.out.println("Gecerli ay girniz");
		
		}
        scan.close();
	}

}
