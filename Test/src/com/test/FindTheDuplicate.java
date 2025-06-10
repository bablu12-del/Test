package com.test;

import java.util.HashSet;

public class FindTheDuplicate {

	public static void main(String[] args) {
	int arr[]= {11,33,12,33,77,44,44,66,55,55};

System.out.println("\n________________________________________________");
for(int i=0;i<arr.length-1;i++) {
	for(int jj=i+1;jj<arr.length;jj++) {
		 if(arr[i]==arr[jj]) {
			 System.out.print(arr[i]+" ");
		 }
	}
	
}

System.out.println("\n______________________Using HashSet__________________________");
HashSet<Integer> hs=new HashSet<>();
for(int i=0;i<arr.length;i++) {
if(hs.add(arr[i])==false) {
	 System.out.print(arr[i]+" ");
}
}
	}

}
