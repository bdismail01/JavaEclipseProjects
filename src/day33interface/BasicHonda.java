package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba{
	
	//class===Interface : implements yapmali
	//class===class : extends yapmali
	//Interface === interface : extends yapmali.

	public static void main(String[] args) {
		BasicHonda basicHonda = new BasicHonda();
		basicHonda.diesel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();

	}

	@Override
	public void move() {
		System.out.println("120km 'ye kadar yakit tasarrufludur");
		
	}

	@Override
	public void kapi() {
		System.out.println("4 kapili ve celik konsorsiyum");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Normal plastik direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("üc farkli kumas secenekli");
		
	}

	@Override
	public void klima() {
		System.out.println("Iki bolmeli manuel kumandali");
		
	}

}
