package com.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ram");
	list.add("Raju");
	list.add("Vijay");
	list.add("Ajith");
	for(String object : list) {
		System.out.println(object);
	}
}
}
