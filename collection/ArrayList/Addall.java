package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Addall {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Vijay");
	list.add("Ajith");
	list.add("Vikram");
	
	ArrayList<String> list2 = new ArrayList<>();
	list.add("simbu");
	list.add("Dhanush");
	list.add("Surya");
	
	list.addAll(list2);
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
