package day38interview;

public class InterviewHazirlik01 {
	
	/* java "platform independent' proglama dilidir
	 *  yani bir platformda yazilan code'lar baska bir platformda da calisir.
	 *  Mac te yazilan windows'ta calisir
	 *  
	 *  2)IDE ==>Integrated development Environment demektir.
	 *   Eclipse ve intellij piyasadaki kulllanilan meshur iki IDE dir
	 *   
	 *  3)==>yeni bir object olusturulurken contructor akti e olur ve pbject'i uretir
	 *      return type yokktur
	 *      ismi class isni ile ayni olmalidir
	 *      Object uretmek icin Constructor uretmek zorunda ddegiliz.
	 *      
	 *      Cunku java her class icin defoult constructor uretmistir.
	 *      default constructor'lar parametresizdir
	 *      Biz constructor urettigimizde default yok olur
	 *      Constructor'lar overload edilebilr
	 *      Constructor'lar child class'lardan cagrilabilrler ama override edilemezler
	 *      
	 * **4) OOP Concept nedir
	 *       a)inheritance  b) Enacapsulatioin  c) Polymorfhizm
	 *       d) Abstraction e) Interface  icerir.
	 *    
	 *  5) inheritace nedir?         
	 *       Inheritance parent(super class) ve child(sub class) iliskisidir
	 *       A class'i B class 'ina extend ederse A child olur, b parent olur.
	 *       A class B interface'ine implements ederse A child ,B parent olur.
	 *       A interface 'i B interface'ina extends ederse A child, b parent olur
	 *       Child parent 'teki kodlarin public ve protected olanlari kullanir
	 *       Reusability(tekrar kullanabilme), short coding(kodu kisa yazma),
	 * *      maintenance(tamir ) faydalari vardir
	 *
	 *   6) Encapsulation nedir?
	 *       Data hiding (Data gizlemek) demektir.
	 *       private yapilarak gizlenir
	 *       getter() ile okunur, setter() ile degistirilir.
	 *       Degistirilmeseini istemedigimiz kodlari koruma altina almak icinkullanilir.
	 *       sadece okunmasini istiyorsak setter() olusturulmaz.(Immutabke class)
	 *       okunmasini da degistirlmesini de istemiyorsak getter() da setter() da olusturmayiz
	 *       
	 *   7) Polymorphism nedir?
	 *       Coklu yapi demektir. Overloading ve overriding'dir.
	 *       
	 *   8) Abstruction Classs nedir?
	 *       Abstract class uretmek icin abstract keyword kullanmaliyiz
	 *       Abstract class'lardan object uretilmez.
	 *       Abstract class 'larda hem abstract hem concrete method 'lar bulunabilir
	 *       Abstract method'un oldugu class keesinlikle abstract olmalidir.
	 *       Abstract methodlarin(body siz) concrete child'lar tarafindan oveerride edilmese de olur
	 *    **  Abstract class'i child class'lari bazi gorevleri yapmak zorunda birakamk icin olustururuz.
	 *   
	 *   9) Interface nedir?
	 *       Java normalde multiple inheritance musade etmez bu yuzden 
	 *       Abstract class kullandigimizda multiple inheritance yapamayiz.
	 *       multiple inheritance kullanmak zorunda oldugumuz proojelerde bunu interface ile hallederiz
	 *       Interface'lere multiple implements/extends yapilabilir.
	 *       
	 *   10) Overloading nedir?
	 *       method ismi ayni tutularak parametrelerin sayilari ve yerleri veya data type'leri 
	 *       degistirilerek methodlar olusturmadir.
	 *       Overloading compile time'dir yani overloadimg'te yaptiginiz hata code yazarken belli olur
	 *       Neden papariz: Ayni isme, ozellige sahip methodlarla farkli islemler yapabilmek icin
	 *       Mesala substring() methodunda tek parametreli de  ve iki parametreli(substring(4, 7)) de vardir.      
	 *    
	 *    11)Overriding nedri?
	 *       Method Signatur'a (method ismi + parametelere) dukunmadan sadece body'i degistiriyoruz
	 *       Overriding inheritance olunca yani parent child iliskisi olunca olur.
	 *       Neden ihtiyac duyuyoruz:
	 *       Syni methodu farkli kullanilmlar icin overriding gereklidir.
	 *       mesela Animal da ses cikarma methodu var ama dog ta ses farkli(Havlama),, kedi(meow) gibi
	 *       mesela bir otel de yatak methodu her oda icicn farki yapida olabilir. yayli yatak , sunger yatak gibi
	 *       
	 *    12) Array ile arraylist arasindaki farklar nelerdir.
	 *       Array olusturulurken uzunlugu belli edilmek zorundadir ve daha sonra uzunluk degistrilemez 
	 *       Fakat ArrayList'lere eleman ekledikce uzunluk artar, elelmsn sildikce kisalir
	 *       
	 *    13) String ile StringBuilder aarasindaki fark nedir
	 *       String'ler Immutable'dir yani bir Srting yaptimii sonradan degistiremyiz
	 *       StringBuilder ise mutable'dir yani sonradan degistirilebilir
	 *       Mesela; bir String'i tersten yazdirmak icin kullanilan reverse() methodu gibi
	 *         
	 
	 * 
	 * 
	 */
	
	
}
