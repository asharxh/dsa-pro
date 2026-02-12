package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class FindALLNonRep {
    public static void main(String[] args) {
        int[] arr = {3,9,2,4,3,7,7,5,8,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int key:map.keySet()){
            if(map.get(key) == 1){
                System.out.print(key + " ");
              }
        }
    }
}