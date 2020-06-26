package day27constructorcagirma;

public class Mammal extends Animal{

	public boolean dogum = true;

	public static void main(String[] args) {
		
		//Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal(15);

	}
	
	public void feed() {
		System.out.println("Cocukalrini besler");
	}
	
	Mammal(){
		this(11);// Parentteki parametresiz constructor i cagir demektir
		        //super() keyword 'unu kullanmasanizda olur ama bazilari kullanir sasirmayin
		        // super() kullanilacaksa mutlaka ilk satirda olmalidir.
		        // super() ve this() ayni constructor 'un icinde kullanilamaz
		        // cunku ikisi de ilk satirda olmalidir
		
		System.out.println("Mammal parametresiz constructor");
	}
	
	public Mammal (int age) {
		super();
		System.out.println("Mammal parametreli cinstructor");
	}


}




