package org.collections.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to java class";
		String[] sub = s.split(" ");

		Map<Character, Integer> mp = new HashMap<Character, Integer>();

		for (int i = 0; i < sub.length; i++) {
			
			if (sub[i].equals("java")) {
				char[] arr = sub[i].toCharArray();

				for (int i1 = 0; i1 < arr.length; i1++) {
					if (arr[i] == 'a')
						mp.put(arr[i], mp.get(arr[i]) + 1);

					else
						mp.put(arr[i], 1);
				}

			}
			
		}
//Use Entry set if you need both Keys and Values
		for (Map.Entry<Character, Integer> e : mp.entrySet()) {
			if (e.getKey().equals('a'))
				System.out.println(e.getKey()+ " " + e.getValue());
		}

	}

}
