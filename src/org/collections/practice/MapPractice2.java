package org.collections.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to the world";
		String g = s.toLowerCase();
		char[] arr = g.toCharArray();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (mp.containsKey(arr[i]))

				mp.put(arr[i], mp.get(arr[i]) + 1);

		else {
			mp.put(arr[i], 1);
			}
		}
		
		//Use Entry set if you need both Keys and Values
		for (Map.Entry<Character, Integer> e : mp.entrySet()) {
			if(e.getKey().equals('o'))
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
