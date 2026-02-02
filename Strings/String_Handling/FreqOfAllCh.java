package String_Handling;

public class FreqOfAllCh {
    public static void main(String[] args) {
        String s = "ashar loves leetcode";

        boolean[] visited = new boolean[s.length()];

        for(int i = 0; i<s.length(); i++){
            if(visited[i]){
                continue;
            }
            int freq =1;

            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    freq++;
                    visited[j] = true;
                }
            }
            System.out.println(s.charAt(i) + " = " + freq);
        }
    }
}


/*
Note for me:
This is brute force approach.
UpperCase and LowerCase count as different due to diff ASCII value.

 */