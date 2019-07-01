package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	list.add("Vijay");
	list.add("Ajith");
	list.add("Arya");
	Iterator it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
