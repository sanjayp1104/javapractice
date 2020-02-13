package com.practice.core.general;

import java.math.BigInteger;

public class MathExample {
	public static void main(String[] args) {
		System.out.println("Math.E "+Math.E);
		System.out.println("Math.PI "+Math.PI);
		System.out.println("Math.sqrt(16)) "+Math.sqrt(16));
		System.out.println("Math.pow(3, 2) "+Math.pow(3, 2));
		System.out.println("Math.abs(-99) "+Math.abs(-99));
		System.out.println("Math.max(20, 10) "+Math.max(20, 10));
		System.out.println("Math.min(20, 10) "+Math.min(20, 10));
		System.out.println("Math.max(99.9, 20.5) "+Math.max(99.9, 20.5));
		System.out.println("Math.min(99.9, 20.5) "+Math.min(99.9, 20.5));
		System.out.println("Math.ceil(10.2) "+Math.ceil(10.2));
		System.out.println("Math.ceil(10.5) "+Math.ceil(10.5));
		System.out.println("Math.ceil(10.9) "+Math.ceil(10.9));
		System.out.println("Math.floor(10.2) "+Math.floor(10.2));
		System.out.println("Math.floor(10.5) "+Math.floor(10.5));
		System.out.println("Math.floor(10.9) "+Math.floor(10.9));
		System.out.println("Math.round(10.2) "+Math.round(10.2));
		System.out.println("Math.round(10.5) "+Math.round(10.5));
		System.out.println("Math.round(10.9) "+Math.round(10.9));
		System.out.println(Math.random());
		System.out.println((int)(10*Math.random()));
		System.out.println(100*Math.random());
		System.out.println((int)(1000*Math.random()));
		System.out.println((int)(10000*Math.random()));
		System.out.println((int)(10000*Math.random()));
		System.out.println((int)(10000*Math.random()));
		System.out.println((int)(10000*Math.random()));
		System.out.println((int)(1000000*Math.random()));
		System.out.println((int)(1000000*Math.random()));
		
		System.out.println("BigInteger");
		
		BigInteger bint1 = new BigInteger("4");
		System.out.println(bint1.bitCount());
		//Number of 1 bit
		System.out.println(bint1.bitLength());
		// Number of total bits Allocated
		long val = 9223372036854775807L; // MAX VALUE
		long val2 = 100;
		long res = val + val2;
		System.out.println(res);
		
		}

}
