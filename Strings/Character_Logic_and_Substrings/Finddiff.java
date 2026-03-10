package Character_Logic_and_Substrings;

public class Finddiff {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char result =0;
        for (char c : s.toCharArray()) {
            result^=c;
        }
        for (char c : t.toCharArray()) {
            result^= c;
        }
        System.out.println(result);
    }
}
