package Frequency_Counting_and_Lookup;

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

/*
Note for me:
first i created an arr then HashSet with name set
HashSet start from 0, then i use loop to iteration in array, if set find element that already
add in set set.add(arr[i]);
then if statement will be true element that repeating first will be printed and loop will break.
 */
