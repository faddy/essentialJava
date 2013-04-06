package stringsPackage;

import java.util.HashMap;

/*
 * To check if two strings are anagrams of not.
 * A simple way is to sort the strings and then check for equality.
 * This alternative approach here uses a hashmap to store counts
 * of characters in the string and then compares them
 * */
public class Anagrams {
	
	public static void main(String[] args){
		
		char[] arr1 = "I am Fahad".toCharArray();
		char[] arr2 = "I am Rose".toCharArray();
		
		System.out.println( areAnagrams(arr1, arr2) );
	}
	
	public static boolean areAnagrams(char[] arr1, char[] arr2){
		
		if (arr1.length != arr2.length) return false;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : arr1) {
			if ( map.containsKey(ch) ) map.put(ch, map.get(ch) + 1);
			else map.put(ch, 1);
		}
		
		for (char ch : arr2){
			if ( map.containsKey(ch) ) {
				int value = map.get(ch);
				if (value==0) map.remove(ch);
				map.put(ch,  - 1);
			}
			else
				return false;
		}
		
		return false;
	}

}
