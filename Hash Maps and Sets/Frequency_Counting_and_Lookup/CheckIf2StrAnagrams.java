package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class CheckIf2StrAnagrams {
    public static void main(String[] args) {
        String s1 = "ashar";
        String s2 = "rahsa";

        if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s1.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (char c : s2.toCharArray()) {
                if (!map.containsKey(c) || map.get(c) == 0) {
                    System.out.println("Not Anagram");
                    return;
                }
                map.put(c, map.get(c) - 1);
            }
            System.out.println("Anagram");
        }
    }
}