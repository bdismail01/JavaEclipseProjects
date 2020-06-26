package day30exeption;

public class Sorular2 {

	public static void main(String[] args) {
		
		try {
			hop();
		}catch(Exception e) {
			e.printStackTrace();
			//printStackTrace () methodu Exception'lsrin nerde olustugunun
			//detayli bilgisini verir
			//Excdption satirlarini olusum sirasina gore console 'de  gosterir.
		}

	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
	
		

	

}
