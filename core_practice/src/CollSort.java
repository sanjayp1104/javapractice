import java.util.ArrayList;
import java.util.Collections;

public class CollSort {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("aAaA");
		arr.add("AaA");
		arr.add("aAa");
		arr.add("AAaa");
		
		Collections.sort(arr);
		
		for(String s :arr) {
			System.out.print(s+" ");
		}
		
		/*
		 * String str="JAVA"; int a= Integer.parseInt(str);
		 */
	}

}
