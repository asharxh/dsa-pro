package Subarrays_and_Fixed_Targets;

public class SubarrayhasSumK {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7,9};

        int k = 9;
        boolean found = false;
        for(int i=0; i< arr.length; i++){
            int sum = 0;
            for(int j =0; j<arr.length; j++){
                sum+=arr[j];
                if(sum == k){
                    found=true;
                    break;
                }
            }
            if(found)
                break;
        }
        System.out.println(found);
    }
}
