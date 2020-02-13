package com.practice.core.general;

public class ArrayEg {
	public static void main(String[] args) {
		String[] str= {"AAA","BBB"};
		String[] str1 = new String[] {"CCC","DDD"};
		int[] intarr = new int[5];
		int count =0;
		
		for(String i:str) {
			System.out.println(i);
			intarr[count]=count+1;
		}
		
		for(String i:str1) {
			System.out.println(i);
		}
	}

}
