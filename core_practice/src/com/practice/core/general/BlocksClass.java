package com.practice.core.general;

public class BlocksClass extends BlockClassP{
	/*static int a;
	
	 * { a=10; System.out.println("Initialized :"+a); }
	 */
	public BlocksClass() {
		System.out.println("In BlockClass(Child) Constructor");
	}
	static int a=10;
		{
			a=20;
		System.out.println("Child Instance Block :"+a);
		}
	
	static{
		System.out.println("Child Static Block :"+a);
		}

}
