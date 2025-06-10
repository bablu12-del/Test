package com.test;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,7};
		
		int expected_sum=arr.length+1;
		int sum=expected_sum*(expected_sum+1);
		sum=sum/2;
		int total_sum=0;
		
		for(int i=0;i<arr.length;i++) {
			total_sum=total_sum+arr[i];
		}
		
		System.out.println("Missing Number is "+(sum-total_sum));
		
		int xor1=arr[0];
		for(int i=1;i<arr.length;i++) {
			xor1=xor1^arr[i];
		}
		
		int xor2=1;
		
		for(int i=2;i<=arr.length+1;i++) {
			xor2=xor2^i;
		}
		
		System.out.println("Missing Number using xor is "+(xor1^xor2));

	}

}
