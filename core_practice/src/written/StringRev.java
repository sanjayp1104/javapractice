package written;

public class StringRev {
	public static void main(String[] args) {
		String str = "ABCD";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println("Using String Bulder");
		System.out.println("Original String : "+str);
		System.out.println("Reverse String "+sb.reverse());
		
		System.out.println("Using Char[]  "+str);
		
		char[] chars = str.toCharArray();
		String nstr="";
		for(int i=chars.length-1; i>=0;i--) {
			System.out.println("i  "+i);
			nstr=nstr+chars[i];
		}
		
		System.out.println("Output "+nstr);
		
		System.out.println("Using String Charat");
		
		for(int j=str.length()-1;j>=0;j--) {
			System.out.print(str.charAt(j));
		}
		
		System.out.println("Using String split\n");
		
		String[] strs = str.split("");
		
		for(int k=strs.length-1;k>=0;k--) {
			System.out.print(strs[k]);
		}
		
	}

}
