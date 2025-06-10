package com.test;

public class KthLargestFromArray {

	public static void main(String[] args) {
		int arr[]= {6,8,4,3,12,88,32};
		int k=2;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[j]=arr[i]+arr[j];
					arr[i]=arr[j]-arr[i];
					arr[j]=arr[j]-arr[i];
					
				}
			}
			if(i==(k-1)) {
				System.out.println("Kth largest no is "+arr[i]);
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
