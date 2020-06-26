package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// MAp bir interface'dir. MAp interface#in 3 tane child class 'i vardir.
		//1) HAshMap: Key-Value yapisini kullanir.Peogeramci tarafidan yazilir
		//            Key ve value de null degeri kulllanilabilir.Key'de birden fazla null degeri kulllanilirsa
		//            java son kullanilan degeri kabul eder.
		//            HashMap console'a yazdirildiginda  key degereleri
		//            ve value degerleri arasina = sembolu konularak yazdirir
		//          * MAp'ler arasinda en hizlisi HAshMAp'dir
		//            HashMAp'ler  "thread safe" degildir. yani ayni anda birkac bolumde calisamaz.
		
		
		
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Ali");
		hashMap.put(1, "Veli");
		hashMap.put(2, "Mine");
		System.out.println(hashMap);//Console'a yazdirdigimizda  rastgele basar.
		
		hashMap.remove(3);
		System.out.println(hashMap);//{1=veli, 2=mine}
		
		System.out.println(hashMap.remove(1, "Veli"));//eger veriler dogruysa true verir yoksa false
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get("4"));//null olmayan degere
		
		System.out.println(hashMap.keySet());//sadece key'leri gosterir
		System.out.println(hashMap.values());//value'leri gosterir
		
		System.out.println(hashMap.size());//kac eleman var
		
		System.out.println(hashMap.containsKey(2));//true
		System.out.println(hashMap.containsKey(4));
		
		System.out.println(hashMap.containsValue("Mine"));
		System.out.println(hashMap.containsValue("Ali"));
		
		hashMap.replace(2, "Ahmet");
		System.out.println(hashMap);
		
		//hashMap.clear();//tum elemanlari siler
		//System.out.println(hashMap);
		
		
		
		
		
		
		
		
		
		
	}

}
