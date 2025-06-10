package com.test;

public class PeakElement {

	public static void main(String[] args) {
		int arr[]= {2,4,1,33,6,7,9,8,7,6,8,11,1};
		
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i+1]>arr[i] && arr[i+1]>arr[i+2]) {
				System.out.println(arr[i+1]);
			}
		}

	}

}
