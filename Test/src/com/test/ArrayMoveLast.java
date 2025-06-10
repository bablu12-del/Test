package com.test;

public class ArrayMoveLast {

	public static void main(String[] args) {
		int a[] = {1,2,3, 1, 5, 4, 1, 8, 3, 1};
//counts noOf ones
		int countNoOfOnes=0;
		for(int i:a){
		if(i==1){
			countNoOfOnes++;
		}
		}
		
//shift none ones to left
		int index=0;
		for(int i:a) {
			if(i!=1)
				a[index++]=i;
		}
//fill the remaining ones 
		
		for(int i=index+1;i<a.length;i++) {
			a[i]=1;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
