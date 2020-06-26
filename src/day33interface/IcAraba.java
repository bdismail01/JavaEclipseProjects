package day33interface;

public interface IcAraba {
	
	int price =2000;
	boolean old = true;
	
	public abstract void direksiyon();
	public void koltuk();
	abstract void klima();
	//default keyword u kullanirsak methoda body eklemk zorundayiz
	//Aksi takdirde compile time Error aliriz
	public default void doseme () {
		System.out.println("Interface 'de default keyword ile doseme yaptim");
	}
	//static keyword kullanirsak method'a body eklemeliz.yosa compile time Error olur.
	public static void isitma() {
		System.out.println("otomatok ");
	}

}
