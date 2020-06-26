package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// Abstract class'lardan obje uretilemez
		//Constractor'lari yoktur
		//Abstract class'lar concrete (bodyli) ve abstract(body'siz) methodlar icerebilir
		//Abstract class' larin concrete ve abstract class olan chil'leri olabiir
		//Abstract class'in child'i concrete ise 
		//Abstract class'taki abstract methodlari mutlaka override etmeli ve body eklenmelidir
		//Abstract class'in child i abstract ise 
		//Abstract class'taki herhangi bir seyi override etmeye gerek yoktur//
		//child class larda mecburi olmasi gerekenler abstract ile mecburilestirilir.
		

	}
	
	public  void concreteMethod() {
		System.out.println("Ben concrete'im");
	}
	
	public  abstract void abstractMethod();

}
