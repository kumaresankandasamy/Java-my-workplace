package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Raju");
		list.add("Vijay");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
				 
		
	}

}
