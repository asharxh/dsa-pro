package Frequency_Counting_and_Lookup;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepElement {
    public static void main(String[] args) {
        int[] arr = {1,6,3,8,6,8};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println("First Repeating : " + arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }
}
