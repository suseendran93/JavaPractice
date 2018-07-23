package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "welcome";

		char[] charArray = input.toCharArray();
		//Linked hash map will be sorted
		//Hash map will not be sorted
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			
			if (mp.containsKey(charArray[i])) {
				
				mp.put(charArray[i], mp.get(charArray[i]) + 1);
				
			} else {
				
				mp.put(charArray[i], 1);
			}

		}
		for (Character key : mp.keySet()) {
			System.out.println(key + "-" + mp.get(key));
		}
	}

}
