package Fixed_Size_Window;

public class MinSumOfSubarrK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int n = arr.length;
        int k = 3;
        int sum = 0;
        for(int i =0; i<k; i++){
            sum+=arr[i];
        }
        int maxsum = sum;
        for(int i=k; i<n; i++){
            sum+=arr[i] - arr[i-k];
            maxsum = Math.min(maxsum, sum);
        }
        System.out.println(maxsum);
    }
}


/*
This is Main logic in sliding window fixed size
sum+=arr[i] - arr[i-k];
remove one and add one element
 */