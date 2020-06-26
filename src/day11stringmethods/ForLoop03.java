package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// ilk 4 syma sayisinin carpimini veen for loop olusturunuz
		//1,2,3,4==1*2*3*4=24
		
		int product = 1;
		for(int i= 1; i<5; i++) {
			product = product * i;
		}
		System.out.println("toplam: "+ product);
		
		//ilk 6 cift sayma sayisinin carpimini veren for looop olustrunuz
		
		int product2 = 1;
		for(int  i=2; i<13; i+=2) {
			product2 = product2 * i;
		}
		System.out.println("sonuc: "+ product2);
		//mat de birer birer geri sayim yapip carpmaya faktoryel denir
		//6!=6*5*4*3*2*1=
		//interview sorusu
		
		
		//9! i hesaplayan programi for loop kullanarak yaziniz
		
		int product3 = 1;
		for(int i=9; i>0; i--) {
			product3 = product3 * i;
		}
		System.out.println("sonuc: "+ product3);

	}

}
