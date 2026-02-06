package Fixed_Size_Window;

public class MaxSumOfSubArrK {
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
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
    }
}


/*
Note for me
first loop calculate summ of first window, this is initial window 2+1+5 = 8
then i created maxsum to compare with new sum. Second loop slide a fixed-size window one step at a time
Element added -> arr[i]
Element removed -> arr[i-k]
So, new sum becomes: sum = previoussum + arr[i] - arr[i-k]

In sliding window maintain a window, update result incrementally and  slide efficiently.
It provide optimal for contiguous data and use simple pointer based logic
 */