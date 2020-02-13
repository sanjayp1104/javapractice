package written;

import java.util.HashMap;

public class WordsInString {
	public static void main(String[] args) {
		String str="Write a Java program to count the number of words in a string? public class WordCount { static int wordcount";
		String[] strs = str.split(" ");
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		
		for(int i=0; i<=strs.length-1;i++) {
			if (hm1.containsKey(strs[i])) {
				int count = hm1.get(strs[i]);
				hm1.put(strs[i], count+1);
				
			}else {
				hm1.put(strs[i], 1);
			}
		}
		
		System.out.println(hm1);
	}

}
