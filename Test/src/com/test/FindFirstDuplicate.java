package com.test;

import java.util.HashSet;

public class FindFirstDuplicate {

	public static void main(String[] args) {
		int arr[]= {11,33,12,33,77,44,44,66,55,55};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int jj=i+1;jj<arr.length;jj++) {
				 if(arr[i]==arr[jj]) {
					 System.out.print("First Duplicate no in the Array is "+arr[i]+" \n");
					 temp=1;
					 break;
				 }
			}
			if(temp!=0) {
				break;
			}
			
		}
		
		System.out.println("\n_____________________Using HashSet_________________________________\n");
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(hs.add(arr[i])==false) {
				 System.out.print("First Duplicate no in the Array is "+arr[i]+" ");
				break;
			}
		}

	}

}
