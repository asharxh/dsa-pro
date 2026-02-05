package Pointer_Fundamentals;

public class PairWGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,5};

        int target = 7;

        int l = 0;
        int r = arr.length - 1;
        boolean found = false;
        while(l<r){
            int sum = arr[l] + arr[r];

            if(sum == target){
                System.out.println("Pair: " + arr[l] + ", " + arr[r]);
                System.out.println("sum = " + sum);
                found = true;
                break;
            }
            else if(sum<target){
                l++;
            }
            else {
                r--;
            }
        }
        if(!found){
            System.out.println("No pair found");
        }
    }
}

/*
Note for me :
array must be sorted.
left point and right pointer both are check two gather.
it will print first pair that sum is target

 */