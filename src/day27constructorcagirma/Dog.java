package day27constructorcagirma;

public class Dog extends Mammal {
	
	public boolean sadik = true;

	public static void main(String[] args) {
		
		Dog dog = new Dog();

	}
	
	public void bark() {
		System.out.println("kopekler havlar");
	}
	
	Dog(){
		super();//this() ayni class icindeki parametresiz constructor'i cagirmak icn kullanilir.
		System.out.println("Dog parametresiz constructor");
	}
	

}
