package com.test;

import java.util.Arrays;
import java.util.Collections;

public class sortArray {

	public static void main(String[] args) {
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		
		//Arrays.sort(arr);
		//Arrays.sort(arr,1,5);
		
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
		 */
		
		String s1="mam";
		String rev="";
		char ch;
		
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
			rev=ch+rev;
		}
		
		System.out.println("Reverse "+rev.toLowerCase());
		if(rev.equalsIgnoreCase(s1)) {
			System.out.println("This is Plindrome "+s1);
			
		}else {
			System.out.println("This is not Plindrome "+s1);
			
		}

	}

}
