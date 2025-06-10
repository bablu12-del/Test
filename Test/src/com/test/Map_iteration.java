package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Map_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hs1=new HashMap<String,Integer>();
		hs1.put("id", 232);
		hs1.put("name", 5);
		hs1.put("lName", 4);
		hs1.put("email", 2);
		hs1.put("city", 3);
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>(hs1);
		TreeMap<String,Integer> tm1=new TreeMap<String,Integer>(hs1);
		Set s=tm.keySet();
		Iterator it =s.iterator();
		while(it.hasNext()) {
			String key=(String)it.next();
			Integer val=tm.get(key);
			System.out.println(key+"  "+val);
			
		}
		Set s1=tm1.entrySet();
		Iterator it1=s1.iterator();
		System.out.println("________________________________________________________");
		while(it1.hasNext()) {
			Map.Entry entry=(Map.Entry)it1.next();
			String key = (String)entry.getKey();
			Integer val=(Integer)entry.getValue();
			System.out.println(key+"  "+val);
		}
	}

}
