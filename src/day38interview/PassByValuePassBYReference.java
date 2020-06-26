package day38interview;

public class PassByValuePassBYReference {

	public static void main(String[] args) {
		//Birmethod'a bir variable yollandiginda java o variable'in kopyasini olusturur ve kopyayi yollar
		//bu yuzden variblee'in orjinal degeri method calistiktansonra da aynidir
		// Mesela gomlek fiyati ni gaziler icin %10 , ogrenciye %20, yasliya %5 indirim uygulasa
		// eger orjinal degeri korumazsak indrimleri hep bir once yapilan indirim uzerinden yapar
		//o zaman indirimler cok farkli olur . bunu orteadan kaldirmak icin orjinal fiyati korumamiz gerekir.
		// Mesela;ogrenci method'u fiyati cagirdiginda kopya fiyat gider indirimi gercek fiyat uzerunden yaapr
		// gazi() method'u fiyati cagirdiginda ilk, orjinal fiyati kopyalar onu gonderir.
		//bu Pass by Value'dir.
		
		//PAss by Reference ise java kullanmaz.
		//Pass by Reference de reference'nin kopyasi olusturulup method'a yollanir
		// fakat kopya da orjinal gibi ayni object'i gostediginden orjinal deger degisir.
		
		int x = 12;
		System.out.println(increment(x));//13
		System.out.println(x);//12
		
		

	}
	
	public static int increment(int a) {
		a= a +1;
		return a;
	}

}
