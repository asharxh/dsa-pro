package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class MostCommonWord {
    public static void main(String[] args) {

        String text = "Ashar hit a ball, the hit BALL flew far after it was hit";

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for(String w : words){
            map.put(w, map.getOrDefault(w, 0)+1);
        }
        String ans = "";
        int max = 0;

        for(String w : map.keySet()){
            if(map.get(w) > max){
                max = map.get(w);
                ans =w;
            }
        }
        System.out.println("Most Common Word = " + ans);
    }
}