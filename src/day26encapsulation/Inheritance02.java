package day26encapsulation;

//Inheritanc01, inheritance02 'nin parent'i olacak
//extends 'ten sonraki parent , onceki Child olur.
// Child parent'ten alabilr ama parent child#den alamaz
// child parent'ten daha fonktional'dir.
//
public class Inheritance02 extends Inheritance01 {

	public static void main(String[] args) {
		// chikd'in birden fazla parent'i olur mu? Olmaz. 
		// java "multiple inheritance" 'i desteklemez? olur."Hiyerarsik Inheritance" denir.
		
		//child[a, b]--> parent[c, d, e]--> grandParent[f, g]
		//child a,b,c,cd,e,f,g
		//parent c,d,e,f,g
		//grandparent f,g
	}

}
