package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1 implements Comparable{
	int sid;
	String sname;
	String email;
	public Student1(int sid, String sname, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
	}
	@Override
	public int compareTo(Object o) {
		Student1 s1=(Student1)o;
		return (this.sid-s1.sid);
	}
	@Override
	public String toString() {
		return sid + " " + sname + " " + email;
	}
	
}

class sname1Comparator implements Comparator{
	public int compare(Object o1, Object o2) {
		Student1 s1 =(Student1)o1;
		Student1 s2 =(Student1)o2;
		return s1.sname.compareTo(s2.sname);
	}
	
}

class emailComparatpr implements Comparator{

	public int compare(Object o1, Object o2) {
		Student1 s1=(Student1)o1;
		Student1 s2=(Student1)o2;
		return s1.email.compareTo(s2.email);
	}
	
}

public class comparableAndComparator {
	public static void main(String[] args) {
		Student1 s1=new Student1(103,"Bablu","cbablu@gmail.com");
		Student1 s2=new Student1(101,"Adbut","zbablu@gmail.com");
		Student1 s3=new Student1(102,"cablu","bbablu@gmail.com");
		
		ArrayList list=new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Collections.sort(list);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using sname sorting");
		Collections.sort(list,new sname1Comparator());
		 it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			

			System.out.println("Using email sorting");
			Collections.sort(list,new emailComparatpr());
			 it=list.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		
	}

}
