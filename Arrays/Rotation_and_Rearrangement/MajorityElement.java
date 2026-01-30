package Rotation_and_Rearrangement;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,7,4,4,2,3,5,4,5,3,2,4,1,4,1,2};

        int c = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == c) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    c = nums[i];
                    count = 1;
                }
            }
        }

        System.out.println("Majority Element = " + c);
    }
}