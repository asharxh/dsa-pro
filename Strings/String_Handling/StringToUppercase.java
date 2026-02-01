package String_Handling;

public class StringToUppercase {
    public static void main(String[] args) {
        String s = "ashar leetcoder";
        String upper = "";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                upper+=(char)(ch-32);
            }
            else {
                upper+=ch;
            }
        }
        System.out.println(upper);
    }
}


/*
In first if statement I check character is lowercase English letter (ASCII value 97-122).
then i converted lower to upper by subtracting with 32
example :
97 - 32 = 65, So 65 is uppercase A
and 122-32 = 90 is Z.

I can also use the simplest approach in java String.toUpperCase(). This is inbuild and optimized.
simple.
 */