package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class EleApMorethenN2T {
    public static void main(String[] args) {
        int[] arr = {3,3,7,8,3,8,3};

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) > n/2){
                System.out.println("Majority = " + num);
                break;
            }
        }
    }
}
