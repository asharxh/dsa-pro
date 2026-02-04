package Subarrays_and_Fixed_Targets;

public class CountSubarrWDivK {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,4};
        int k =5;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum%k ==0){
                    count++;
                }
            }
        }
        System.out.println("Subarray Count : " + count);
    }
}

/*
Note for me:
In first i=0 iteration 4+2+3+1 = 10 % 5
In second i=1 iteration 2+3 = 5% 5 and 2+3+1+4 = 10%5
In third i =2 no div by 5
In fourth i=3 iteration 1+4 = 5%5
In fifth i=4 no div by 5 . only last element left
 */
