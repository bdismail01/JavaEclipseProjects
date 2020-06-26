package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo = "34212367512";
	private int krediKartNo = 1234566;
	private boolean soguk = true;

	public static void main(String[] args) {
		// Encapsulaiton data saklama (data hiding) yontemidir.
		//Encapsulation iki step te yappilir.
		// 1) Data'yi (variablke ve nethodlari) ""private"" yapmalisiniz.
		// 1)public oöan getter() ve settter() methodlar uretmeliyim.
		// getter() data'yi okuamaiza yarar, data 'da degisikilik yapamaz.
		// setter() ise data'yi degistirmemize yarar.
		
		
		

	}
	// getter(9 icin ; 1- access modifier public olmali
	//                 2-return type variable nin return type ile ayni olmali
	//                 3-Method ismi get+variable ismi seklinde olmali
	
	public  String getKimlikNo() {
		return kimlikNo;
	}
	
	
	public  int getkrediKartNo() {
		return krediKartNo;
	}
	
	// return type boolean ise method ismi "is" ile baslar. "get" kullanilmaz.
	public boolean isSoguk() {
		return soguk;
	}
	
	//settter() uretmek icin; 1-Access modifier public olmali
	//                        2- return type void olmali
	//                        3-method ismi "set+variable ismi" seklinde olmali
	//                        4-parametre kullanilmali
	//                        5-setter() kullanmazsaniz "inmutibel" encapsulation
	public void setKimlikNO(String kimlikNo) {
		this.kimlikNo =kimlikNo;
	}
	
	public void setKrediKartNo(int krediKArtNo) {
		this.krediKartNo = krediKArtNo;
	}
	
	public void setSoguk(boolean soguk) {
		this.soguk = soguk;
	}
	
	
	

}
