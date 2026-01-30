package Rotation_and_Rearrangement;

public class LongestConsSeq {
    public static void main(String[] args) {
        int[] arr = {11,5,6, 4,10,1, 2,3};

        int longest = 0;
        for(int i=0; i<arr.length; i++) {
            int current = arr[i];
            int count = 1;
            while (true) {
                boolean found = false;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == current+1){
                        current++;
                        count++;
                        found = true;
                        break;
                    }
                }
                if(!found) break;
            }
            longest = Math.max(longest, count);
        }
        System.out.println("Longest consecutive length = " + longest);
    }
}

//1,2,3,4,5,6 is longest consecutive sequence ,one after another. so output will be 6.
