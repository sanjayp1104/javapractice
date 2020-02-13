package written;

public class HashCodeExample {
	public static void main(String[] args) {
		System.out.println("\n*** With Student");
		Student st1 = new Student(99, 31903290);
		Student st2 = new Student(99, 31903290);
		Student st3 = new Student(88, 65799999);
		Student st4 = st1;
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st3 == st4);
		
		System.out.println("Using Equals");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st3.equals(st4));
		} }
		class Student {	
		int sid;
		long phone;
		Student(int sid, long phone) {
		this.sid = sid;
		this.phone = phone;
		}
		
		@Override
			public int hashCode() {
				// TODO Auto-generated method stub
				return super.hashCode();
			}
		
		@Override
			public boolean equals(Object obj) {
				Student  s1 = (Student)(obj);
				return ((this.phone==s1.phone)&&(this.sid==s1.sid));
			}
}
