package com.sangita.collections;
import java.util.*;

public class GroupAnagrams {
	
	public void groupAnagrams(String[] words) {
        
		Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
         
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        List<List<String>> grouped = new ArrayList<>(map.values());
        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }

}
