package Character_Logic_and_Substrings;

public class CountWordInStr {

    public static void main(String[] args) {
        String s = "Ashar can use java to develop backend systems, mobile apps, web apps, desktop apps, and much more.";
        int count = 0;
        boolean inWord = false;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) != ' ' && !inWord){
                count++;
                inWord = true;
            }
            else if(s.charAt(i) == ' '){
                inWord = false;
            }
        }
        System.out.println("Word Count = " + count);
    }


    /*
    Words are Separated by spaces.
     */
}
