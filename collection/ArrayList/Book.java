package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Books {
int id;
String name,author,publisher;
int quantity;
 Books(int id, String name, String author, String publisher, int quantity) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.quantity = quantity;
}

}
public class Book{
	public static void main(String[] args) {
	List<Books> list= new ArrayList<Books>();
	Books book1 = new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);
	Books book2 = new Books(102,"Operating System","Galvin","Wiley",6);
	list.add(book1);
	list.add(book2);
	for(Books obj:list) {
		System.out.println(obj.id+" "+obj.name+" "+obj.author+" "+obj.publisher+" "+obj.quantity);
		
	}
	
	}
	
}
