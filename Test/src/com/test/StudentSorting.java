package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable{
	int id;
	String fname;
	double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}

	public boolean equals(Object o) {
	   Student s1=(Student)o;
		if(this.id==s1.id)
			return true;
		return false;
	}

	@Override
	public int compareTo(Object o) {
		Student s1=(Student)o;
		return this.id-s1.id;
		
	}
	
}


public class StudentSorting {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList();
		Student s1=new Student(3,"Bablu",878.78);
		Student s2=new Student(1,"pablu",845.68);
		Student s3=new Student(2,"cablu",809.75);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("No Sorting");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Sorting");
		Collections.sort(al);;
		for(Student s:al) {
			System.out.println(s);
		}

	}

}
