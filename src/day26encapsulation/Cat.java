package day26encapsulation;

public class Cat extends Mammal {
	
	public boolean clean = true;
	

	public static void main(String[] args) {
		// cat ve dog kardes olurlar boylece
		// kardesler arsinda Inheritance olmaz.
		
		Cat cat = new Cat();
		
		System.out.println("Animal'dan geldi:" + cat.age);
		System.out.println("Animal'dan geldi: " + cat.name);
		cat.eat();
		cat.move();
		System.out.println("mammal'dan geldi:" + cat.dogum);
		cat.feed();
		System.out.println("Cat'tan geldi: " + cat.clean);
		cat.meow();


	}
	
	public void meow () {
		System.out.println("Kediler miyavlar");
	}

}
