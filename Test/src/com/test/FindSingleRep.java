package com.test;

public class FindSingleRep {

	public static void main(String[] args) {
		int[] arr= {5,6,5,3,4,3,4};
		
		int res=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			res=arr[i]^res;
		}
		
		System.out.println("res  "+res);
		

	}

}
