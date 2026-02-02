package Character_Logic_and_Substrings;

public class FirstRepeatingCh {
    public static void main(String[] args) {
        String s = "ashar";
        char answer = '\0';
        for(int i =0; i<s.length(); i++){
            int count = 0;

            for(int j =0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j))
                    count++;
            }
            if(count>1){
                answer = s.charAt(i);
                break;
            }
        }
        System.out.println("First Repeating = " + answer);
    }
}
