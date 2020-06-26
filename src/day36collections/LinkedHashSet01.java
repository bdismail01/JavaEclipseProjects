package day36collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	
	public static void main(String[] args) {
		// LinkedHashSet 1)no dublication
		//               2)Key-Value yapisi var
		//               3)Elemanlari benim istedidigim ,girdigim siraya gore dizer
		//               4)
		
		
		LinkedHashSet<String> lhSet = new LinkedHashSet<>();
		lhSet.add("Z");
		lhSet.add("A");
		lhSet.add("D");
		lhSet.add("B");
		System.out.println(lhSet);
		
		LinkedHashSet<Integer> lhSet1 = new LinkedHashSet<>();
		lhSet1.add(3);
		lhSet1.add(1);
		lhSet1.add(5);
		lhSet1.add(0);
		System.out.println(lhSet1);
		
		TreeSet<Integer> tSet = new TreeSet<>(lhSet1);
		System.out.println(tSet);

	}

}
