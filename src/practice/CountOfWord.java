package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Let's rock the world world WORLD";
		String lowerCase=input.toLowerCase();

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] split = lowerCase.split(" ");// split should be an array of string
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				map.put(split[i], map.get(split[i])+1);
			}
			else {
				map.put(split[i], 1);
			}
		}
		for(String key: map.keySet()) {
			System.out.println(key+"---"+map.get(key));
		}
	}

}
