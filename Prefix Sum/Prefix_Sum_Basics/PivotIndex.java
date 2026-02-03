package Prefix_Sum_Basics;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};

        int totalsum = 0;
        for(int i =0; i<arr.length; i++){
            totalsum+=arr[i];
        }
        int leftsum =0;
        int equil = -1;
        for(int i=0; i<arr.length; i++){
            int rightsum = totalsum - leftsum - arr[i];

            if(leftsum==rightsum){
                equil = i;
                break;
            }
            leftsum+=arr[i];
        }
        System.out.println("Pivot Index = " + equil);
    }
}

/*
Note for me:
Example - 1
Left index = 1+7+3 = 11
right index = 5+6 = 11
since LHS = RHS, index 3 is pivot
 Example - 2
 nums = [1,2,3]
 output = 0
 no index satisfy the balance condition.
 */
