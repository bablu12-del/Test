
package com.test;

import java.util.Stack;
public class test{
	
	 public int longestValidParentheses(String s) {
		 System.out.println("String s 4"+s);
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i)+1==s.charAt(i+1)) {
	            	
	            }uuuuuuuuuuuuuuuuu
	        }
	        return 0;
	    }

  
	  public static void main(String[] args) {
	    	test t=new test();
	    int[] nums= {1};
	    int target=1;
	    int [] arr={-1,-1};
        int x=-1;
        int count=-1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
             x=i;
             count++;
           }
        }
    if(count>0){
        arr[0]=x-count;
        arr[1]=x;
    }
   // return arr;
	  }
}










