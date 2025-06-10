package com.test;

import java.util.Scanner;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int ii=sc.nextInt();
		 * System.out.println(ii);
		 */
		
		int[]a= {1000,1000,3,2,411,999,55,98};
		/*int largest=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest)
				largest=a[i];
		}
		
		System.out.println(largest);*/
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		 
		for(int i=0;i<a.length;i++) {
			System.out.println("arr "+a[i]);
		}
		int index=0;
		for(int i=0;i<a.length-1;i++) {
			
			if(a[i]!=a[i+1]) {
				a[index++]=a[i];
			}
		}
		
		a[index++]=a[a.length-1];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("DDDD "+a[i]);
		}

	}

}
