package day28overriding;

public class Mammal extends Animal{
	
	public boolean birth = true;

	public static void main(String[] args) {
		Mammal mammal = new Mammal();

	}
	
	public void feed() {
		System.out.println("Yavrularini besler");
	}
	
	public Mammal() {
		
		//this icinde bukundugunuz class'taki variabke ve methodlara ulasmanizi saglar
		//Child parent iliskisi varsa this kullanrak
		//parent class'taki variable ve methodlara da ulasabilirisini
		
	    System.out.println(this.birth);
	    this.feed();
	    
	    System.out.println(this.age);
	    System.out.println(this.name);
	    this.move();
	    
	    //Parantezsiz super; sadece parent lerdeki variable ve methodlara ulasmanizi saglar.
	    System.out.println(super.age);
	    super.move();
	}

}
