package com.bilgeadam.sinav03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		Student student1 = new Student("Yunus", "Bilecen", 22);
		Student student2 = new Student("Yunus 1", "Bilecen 1", 21);
		Student student3 = new Student("Yunus 2", "Bilecen 2", 20);
		Student student4 = new Student("Yunus 3", "Bilecen 3", 19);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		System.out.println("----------For------------");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		System.out.println("----------For Each------------");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println("----------While------------");
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student s = iterator.next();
			System.out.println(s.toString());
		}
		
		System.out.println("----------While Short------------");
		
		Collections.sort(students);
		Iterator<Student> iterator2 = students.iterator();
		
		while(iterator2.hasNext()) {
			 Student s1 = iterator2.next();
			System.out.println(s1.toString());
		}
		
		
	}
}
