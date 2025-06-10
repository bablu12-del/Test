package com.test;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int arr[]= {2,2,3,5,33,33,43,44};
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
			}
		}
		
		int temp[] = new int[count+1];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		
		temp[j]=arr[arr.length-1];
		
      for(int i=0;i<temp.length;i++) {
    	  System.out.println(temp[i]);
      }
      
//When Remove the duplicate from Array then first sort the array and after do all those thing.
  	int a[]= {3,20,3,5,5,70,50,55,100,101,70};
	Arrays.sort(a);
    int t[]=new int[a.length];
    int jj=0;
	for(int i=0;i<a.length-1;i++) {
		
			if(a[i]!=a[i+1]) {
				t[jj]=a[i];
				jj++;
			}
		}
	t[jj]=a[a.length-1];
	for(int e:t) {
		System.out.print(e+" ");
	}
    
}
	}


