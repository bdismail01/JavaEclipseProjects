package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// polymorphism => Coklu yapi,demektir. bir method nasil coklu hale gelir.
		//Overloading ve Overriding ile bir method polymorphism haline getirilebilr.
		//Polymorphism'i Overloading ile yaparsaniz "Compile Time Polymorphism" denir
		                 //diger adi : static polymorphism 'dir.
		//Polymorphism'i Overriding ile yaparsaniz "Run Time Polymorphism" denir
		                 //diger adi : dinamic polymorphism'dir.
		

	}
	
	public void eat() {
		System.out.println("ye");
	}
	//Overloading ile polymorphism
	public void eat(String name) {
		System.out.println(name + "ye");
	}
	
	
	
	class Yeni extends Polymorphism01 {
		
		//Overriding ile polymorphism
		public void eat() {
			System.out.println("Lutfen ye");
		}
	}

}
