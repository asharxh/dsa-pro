package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class CountFreqOfStrInArr {
    public static void main(String[] args) {
        String s = "ashar";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);
    }
}
