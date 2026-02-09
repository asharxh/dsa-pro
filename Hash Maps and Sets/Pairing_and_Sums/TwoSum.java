package Pairing_and_Sums;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,6,9};
        int n = arr.length;
        int sum = 6;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            int need = sum - arr[i];

            if(map.containsKey(need)){
                System.out.println("Indices : " + map.get(need) + ", " + i);
                break;
            }
            map.put(arr[i], i);
        }
    }
}
