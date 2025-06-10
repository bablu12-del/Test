package com.test;

import java.util.ArrayList;
import java.util.List;

public class allPossible {

	public static void main(String[] args) {
		int []x= {1,2,3};
		allPossible alPossible=new allPossible();
		List<List<Integer>> res=alPossible.permute(x);
		
		System.out.println(res);

	}
	public List<List<Integer>>permute(int[] nums){
		List<List<Integer>> res=new ArrayList<>();
		boolean [] visited =new boolean[nums.length];
		backtrack(res,nums,new ArrayList(),visited);
		return res;
		
	}
	
	void backtrack(List<List<Integer>>res,int[] nums,List<Integer> curr, boolean[] visited) {
		if(curr.size()==nums.length) {
			res.add(new ArrayList(curr));
			return;
		
		}
		
		for(int i=0;i<nums.length;i++) {
			if(visited[i]==true)
				continue;
			curr.add(nums[i]);
			visited[i]=true;
			backtrack(res,nums,curr,visited);
			curr.remove(curr.size()-1);
			visited[i]=false;
		}
		
	}

}
