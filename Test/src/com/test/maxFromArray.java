package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxFromArray {
	public static void main(String[] args) {
		 int arr[] = {10, 324, 45, 90, 98}; 
		 
		int max= Arrays.stream(arr).max().getAsInt();
		System.out.println("max "+max);
		
		//---------------------------
		int maxx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxx) {
				maxx=arr[i];
			}
		}
		System.out.println("maxx "+maxx);
        //----------------------------
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		
		System.out.println("maxxx "+arr[arr.length-1]);
		//----------------------------------------------
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		System.out.println("maxxxx "+Collections.max(list));
	}

}
