package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class CountFreqOfEleInArr {
    public static void main(String[] args) {
        int[] arr = {1,1,3,8,6,8};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
    }
}


/*
Note for me:
A HashMap<K,V> stores key → value pairs
Here:
Key   = Integer
Value = Integer
In frequency counting:
Key = array element
Value = number of times it appears
Example
1 - 2
3 - 1
8 - 2
6 - 1
Loop will iterate for map.put(i, map.getOrDefault(i, 0)+1);
getOrDefault()  - If key i exists → return its value
If key i does NOT exist → return 0
 */