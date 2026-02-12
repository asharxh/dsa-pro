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

/*
Note for me :
created boolean and assumed its false then loop through each element using for loop.
now check if(!set.add(num)) HashSet.add(element) returns a boolean
So, set.add(num) == false, duplicate found. Means adding fails, the number is already present - now duplicate.
 */