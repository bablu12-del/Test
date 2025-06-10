package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class stuff{
	public void doTask(int i1) {
		for(int i=0;i<i1;i++) {
			System.out.println(i);
		}
	}
}

interface stuffInterface{
	public abstract void name(int i);
}
public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1=List.of(2,3,7,4,99,23,34);
		
		List<Integer> evenList =new ArrayList<Integer>();
		
		for(Integer i:list1) {
			if(i%2==0) {
				evenList.add(i);	
			}
		}
        System.out.println("evenList "+evenList);
        
        //using Stream API 
        List<Integer>newlist=list1.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("newlist "+newlist);
        
        List<Integer>newlist1= list1.stream().filter(n->n>4).collect(Collectors.toList());
        System.out.println("newlist1 "+newlist1);
        
        int a=1111,b=22244,c=3331;
        
        String d=((a>b)&&(a>c)?"A is greatest "+a:(b>c)&&(b>a)?"B is greatest "+b:"C is greatest "+c);
        
        System.out.println(d);
        
        List<String>names =List.of("Aman","Aman","Abisekh","Ajay","Adbhut","Bablu");
        Set<String>newNames=names.stream().filter(n->n.startsWith("A")).collect(Collectors.toSet());
       System.out.println("newNames "+newNames);
       
       stuffInterface r1=(i)->new stuff().doTask(i);
       r1.name(2);
        
	}

}
