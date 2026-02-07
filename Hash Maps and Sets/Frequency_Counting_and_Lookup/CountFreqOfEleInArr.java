package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class CountFreqOfEleInArr {
    public static void main(String[] args) {
        int[] arr = {1,1,3,8,6,8};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}