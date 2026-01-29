package Searching_and_Logics;

public class AllUnqiueEle {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,34,6,6,5,6,4,5,4,25,2};

        for(int i=0; i<arr.length; i++){
            int freq = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    freq++;
                }
            }
            if(freq == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

/*
My Logic here is unique element:
if same number appears more then 1 time freq will increase then if condition freq ==1 will fail.
My Output statement arr[i] will only print unique, if freq ==1.
 */