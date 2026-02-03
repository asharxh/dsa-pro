package Prefix_Sum_Basics;

public class IfArrSplitInto2WEq {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        int totalsum = 0;
        for(int i=0; i< arr.length; i++) {
            totalsum += arr[i];
        }
        int leftsum = 0;
        boolean cansplit = false;

        for(int i =0; i<arr.length -1; i++){
            leftsum += arr[i];
            int rightsum = totalsum - leftsum;
            if(leftsum==rightsum){
                cansplit = true;
                break;
            }
        }
        System.out.println(cansplit);
    }
}

/*
If total sum is odd then cant be split.  like in above array 1+2+3+3 = 9 odd so answer was false
 */