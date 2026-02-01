package String_Handling;

public class ReverseAString {
    public static void main(String[] args) {

        String s = "Ashar";
        String rev = "";

        for(int i = s.length() - 1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}


/*
Note for me:
s.length or int length = s.length , will return number of character in the string,i subtract 1 because
string indices are 0 based.
It will start with i = 4 (0,1,2,3,4) mean r
then rev = rev + s.charAt(i) means r will be place in rev = "r"
after that loop will start again for next char till total length
 */