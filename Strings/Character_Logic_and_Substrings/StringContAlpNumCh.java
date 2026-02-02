package Character_Logic_and_Substrings;

public class StringContAlpNumCh {
    public static void main(String[] args) {

        String s = "Hello how u doing, its my number 12365124";

        boolean hasLetter = false;
        boolean hasDigit = false;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if((ch >= 'A' && ch<= 'Z') || (ch >= 'a' && ch <= 'z')){
                hasLetter = true;
            }
            else if(ch >= '0' && ch <= '9'){
                hasDigit = true;
            }
        }
        System.out.println(hasLetter && hasDigit);
    }
}
