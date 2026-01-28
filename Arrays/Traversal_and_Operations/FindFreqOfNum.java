package Traversal_and_Operations;

public class FindFreqOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,5,4,3,8,5,6,4,5,6,4,5,6,45,6,4,5,6,4,5,6,4,5,6,2,1,2};
        int target = 5;
        int freq = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] ==target){
                freq++;
            }
        }
        System.out.println(freq);
    }
}
