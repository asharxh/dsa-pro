package Frequency_Counting_and_Lookup;

import java.util.HashSet;

public class CheckDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,4};

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for(int num : arr){
            if(!set.add(num)){
                duplicate=true;
                break;
            }
        }
        System.out.println(duplicate);
    }
}
