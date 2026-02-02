package String_Handling;

public class CountFreqOfCh {
    public static void main(String[] args) {

        String s = "Ashar loves leetcode";
        char target = 's';
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
