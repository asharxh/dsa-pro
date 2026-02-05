package Pointer_Fundamentals;

import java.util.Arrays;

public class RMDupFromSortedArr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9};

        int slow = 0;

        System.out.println("Initial aray: " + Arrays.toString(nums));
        System.out.println("slow = " + slow);

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
            System.out.println("Array now:" + Arrays.toString(nums));
        }
        System.out.println("Unique length = " +(slow+1));
        System.out.println("Final unique elements: ");
        for(int i=0; i<=slow; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
