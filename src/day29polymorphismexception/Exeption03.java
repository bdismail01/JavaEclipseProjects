package day29polymorphismexception;

public class Exeption03 {

	public static void main(String[] args) {
		// Bolme islemi yapanbir progranm yapiniz
		
		int num1= 6;
		int num2 = 0;
		try {
		System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("Sifir ilie bolem yapilmaz");
		}catch(Exception e){
			System.out.println("Her Exeption' i yakala");
		}
		//AritmetikExeption runTime Exeption'dur.Matematik kurallarina 
		//uygun olmayan bir islem yapildugunda bu Exeption alijnir
		
		// ty'dan sonra birden fazala catch kullanilabilir.
		// Ama alttaki ccatch üsttekinin child 'i olmalidir.
		// catch'leri siralarken özelden genele dogru dizmelisiniz

	}

}
