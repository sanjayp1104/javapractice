package com.practice.core.general;

public class StringEx {
	public static void main(String[] args) {
		String st1 = "JLC";
		String st2 = new String("JLC");
		String st3 = new String("JLC");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		st3 = "AA";
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st2 == st3);
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));
		}

}
