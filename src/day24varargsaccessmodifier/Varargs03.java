package day24varargsaccessmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Varargs03 {

	public static void main(String[] args) {
		// 
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.set(1,6);
		list.remove(0);
		for (Integer v:list) System.out.println(v);
			
		int[]random = {6,-4,12,0,-10};
		int x=12;
		int y= Arrays.binarySearch(random, x);//sonuc tanimlanamiyor
		
	}

}
