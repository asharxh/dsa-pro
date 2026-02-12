package Frequency_Counting_and_Lookup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EleApMorethenN3T {
    public static void main(String[] args) {
        int[] nums = {3,3,7,4,8,8,3,8,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                result.add(key);
            }
        }
        System.out.println(result);
    }
}
