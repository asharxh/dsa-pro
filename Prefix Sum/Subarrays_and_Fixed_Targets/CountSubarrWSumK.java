package Subarrays_and_Fixed_Targets;

public class CountSubarrWSumK {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,4};
        int k =5;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println("Subarray Count :" + count);
    }
}
