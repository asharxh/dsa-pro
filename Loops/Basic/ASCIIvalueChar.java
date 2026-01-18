package Basic;

public class ASCIIvalueChar {
    public static void main(String[] args) {
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.println(ch + " --> " + (int) ch);
        }
    }
}

// Uppercase and Lowercase both have different ASCII values
// I used type casting (int) and this give ASCII value of Character
// Char input data type