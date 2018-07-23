package org.collections.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to the jungle";
		String uc = s.toUpperCase();
		char[] charArray = uc.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();
		
		//To put key(character) and value(integer)
		for (int i = 0; i < charArray.length; i++) {
			
			if(map.containsKey(charArray[i])) {
				
				map.put(charArray[i], map.get(charArray[i])+1);
			}
			
			
		else
			map.put(charArray[i], 1);
		}

//		// To Print only Values
//		for (Integer i : map.values()) {
//			System.out.println(i);
//		}
//
//		// To Print only keys
//		for (Character c : map.keySet()) {
//			System.out.println(c);
//		}

		// To print both keys and values
		for (Entry<Character, Integer> e : map.entrySet()) {
			if(!e.getKey().equals(' '))
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
