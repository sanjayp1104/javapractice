package com.practice.core.general;

public class BlockClassP {
	static{
		System.out.println("Parent Class ststic block");
	}
	{
		System.out.println("parent class instanse block");
	}
	
	public BlockClassP() {
		System.out.println("Parent class constructor");
	}

}
