package com.test;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr= {2,6,8,9,11,14,18,20};
		
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		int search=14;
		
		while(li<=hi) {
			if(arr[mi]==search) {
				System.out.println("search "+search);
				break;
			}else if(arr[mi]<search) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			 mi=(li+hi)/2;
			
		}
		if(li>hi) {
			System.out.println("not found");
		}
		

	}

}
