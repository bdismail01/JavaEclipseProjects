package day16owerloading;

public class Constructor01 {
	
	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";

	public static void main(String[] args) {
		//Class olisturdugumuzda java class ile beraber bir constructor olusturur,
		//biz onu herhangi bir kod yazmadan direkt kullanabiliriz.
		//Eger constructor un parametresi yoksa DEFAULT constructor dir.
		//Default constructor class olusturukdugunda java tarafinda olusturulur,
		//Biz bir constuctor urettigimizde java default constructor u imha eder.
		
		Constructor01 hondaAraba = new Constructor01(); //Bir tane arba urettik
		
		
		System.out.println("Price: " + hondaAraba.price);//20000
		System.out.println("Year : " + hondaAraba.year);
		System.out.println("Make : " + hondaAraba.make);
		System.out.println("Type : " + hondaAraba.type);

	}

}
