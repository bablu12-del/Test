package com.test;

public class oddAndEven {

	public static void main(String[] args) {
		int arr[] = {10,20,40,12,13,24,15,17};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even "+arr[i]);
			}else {
				System.out.println("Odd "+arr[i]);
			}
		}

	}

}
