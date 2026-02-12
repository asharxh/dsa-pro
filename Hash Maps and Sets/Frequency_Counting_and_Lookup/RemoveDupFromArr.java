package Frequency_Counting_and_Lookup;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupFromArr {
    public static void main(String[] args) {
        int[] arr = {1,1,8,2,8,9,2,3,6,4,4,5};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int i =0;
        int[] unique = new int[set.size()];
        for(int val : set)
            unique[i++] = val;
        System.out.println(Arrays.toString(unique));
    }
}