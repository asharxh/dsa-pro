package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class FirstNonRepCh {
    public static void main(String[] args) {
        String s = "ashar";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(int i =0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                System.out.println("Index : " + s.charAt(i));
                break;
            }
        }
    }
}
