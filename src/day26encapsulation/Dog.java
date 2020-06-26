package day26encapsulation;

public class Dog extends Mammal {
	
	public boolean sadik = true;

	public static void main(String[] args) {
		// dog: bark, feed, move 'de bulunur bu sekilde.
		
		Dog dog = new Dog();
		System.out.println("Animal Classs'taan geldi: " + dog.age);//0
		System.out.println("Ani,al Class'tan geldi: " +dog.name);//null
		dog.eat();//yemek yer
		dog.move();//hareket edebilir
		
		
		System.out.println("mammal Classtan geldi: " + dog.dogum);//true
		dog.feed();//Cocuklarini besler
		
		System.out.println("Dog Class'tan geldi: " + dog.sadik);//true
		dog.bark();//haraket edebilr
		

	}
	
	public void bark() {
		System.out.println("Kopek havlar");
	}

}
