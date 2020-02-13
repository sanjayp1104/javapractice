package com.practice.core.inher;

public class TestClass {
	public static void main(String[] args) {
		//Employee e1 = new Person("AAA", "BBB");
		Person p1 =new Employee("B", "Name1", "Addr1");
		
		System.out.println( p1.details());//
		/* System.out.println( p1.details1()); //Child method cant access child class method directly */
		
		//System.out.println( ((Employee)p1.details1());//Direct Type Cast also Not Possible 
		
		
		if (p1 instanceof Employee ) {
			Employee e1 = (Employee)p1;
			System.out.println(e1.details1());
		}
		
		
	}

}
