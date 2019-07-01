package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	 int id;
	 String name;
	 int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	 
}
public class Userdefinedclass{
	public static void main(String[] args) {
		Student s1 = new Student(1,"Vijay",20);
		Student s2 = new Student(2,"Ajith",20);
		Student s3 = new Student(2,"Surya",20);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Student st =(Student) it.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		
	}
}
