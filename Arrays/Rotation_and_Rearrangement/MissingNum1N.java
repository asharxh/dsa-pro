package Rotation_and_Rearrangement;

public class MissingNum1N {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8};
        int N = 8;

        int missing = -1;
        for(int num=1; num<=N; num++){
            boolean found = false;

            for(int i=0; i<arr.length; i++){
                if(arr[i] == num){
                    found = true;
                    break;
                }
            }
            if(!found){
                missing = num;
                break;
            }
        }
        System.out.println("Missing = " + missing);
    }
}

/*
first I defined variable N to start looping through each value from 1 to N using loop,
to find missing N value must be equal to the highest number in array. So I can check all of them one by one.
After that I loop through entire array that I created and verify that arr[i] is present in array must be
equal to current value of num (found = true) if false then missing = num; and if no missing result = -1;
 */