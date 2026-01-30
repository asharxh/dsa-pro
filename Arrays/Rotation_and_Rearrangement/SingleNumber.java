package Rotation_and_Rearrangement;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 3, 2,3,1,1,2,3};
        int single = -1;
        for(int i=0; i<nums.length; i++){
            int count = 0;

            for(int j = 0; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if(count ==1){
                single = nums[i];
                break;
            }
        }
        System.out.println(single);
    }
}


/*
This is brute force approach O(n2). Its not optimal
For LC 136 and 137 , I have to provide better solution
 */