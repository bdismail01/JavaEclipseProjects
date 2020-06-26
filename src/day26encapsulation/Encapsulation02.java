package day26encapsulation;

public class Encapsulation02 {
	
	private char ilkHarf ='s';
	private double para = 23.75;
	private boolean emekli = false;
	
	//variableye atanan degeriin degistirilmeseini ietemiyorsak setter() olousturmayiz
	// degerin okunmasini istemiyorsaniz getter() olusturmamaliyiz.
	
	//sadece getter() kullanip hic setter() kullanilirsaniz 
	//variable degerleri degistirilemez

	public static void main(String[] args) {
		
		Encapsulation01 obj = new Encapsulation01();
		System.out.println(obj.getKimlikNo());
		obj.setKimlikNO("10000000000");
		System.out.println(obj.getKimlikNo());
		
	}
	//kisa yol source uzerinden getter setter generation u 
	//tiklayip oradan yapilabilir.

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}
	
	

}
