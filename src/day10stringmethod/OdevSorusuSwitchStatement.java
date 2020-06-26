package day10stringmethod;

import java.util.Scanner;

public class OdevSorusuSwitchStatement {

	public static void main(String[] args) {
		// switch odev sorusu
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ay ismi giriniz");
		String ay = scan.next();
		
		switch(ay) {
		case "ocak":
			System.out.println("bu ay 31 gundur");
			break;
		case "subat":
			System.out.println("bu ay ");
			break;
		case "mart":
			System.out.println("bu ay 31 gundur");
			break;
		case "nisan":
			System.out.println("bu ay 30 gundur");
			break;
		case "mayis":
			System.out.println("bu ay 31 gundur");
			break;
		case "haziran":
			System.out.println("bu aay 31 gundur");
			break;
		case "temmuz":
			System.out.println("bu ay 31 gundur");
			break;
		case "agustos":
			System.out.println("bu ay 31 gundur");
			break;
		case "eylül":
			System.out.println("bu ay 30 gundur");
		break;
		case "ekim":
			System.out.println("bu ay 31 gundur");
			break;
		case "kasim":
		    System.out.println("bu ay 30 gündür");
		    break;
		case "Aralik":
		    System.out.println("bu ay 31 gundur");
		    break;
			
			
			
			
			
			
			
			
			
			default:
				System.out.println("bu ayin gun sayisi bilinmiyor");

		
		}
		scan.close();
		

	}

}
