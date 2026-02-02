package Character_Logic_and_Substrings;

public class Check2StringsAnagrams {
    public static void main(String[] args) {
        String s1 = "Ashar";
        String s2 = "Ashar";

        boolean isAnagram = true;

        if(s1.length() != s2.length()){
            isAnagram = false;
        }
        else {
            for(int i = 0; i<s1.length(); i++){
                int count1=0, count2=0;

                for(int j = 0; j< s1.length(); j++){
                    if(s1.charAt(j) == s1.charAt(i))
                        count1++;
                    if(s2.charAt(j) == s1.charAt(i))
                        count2++;
                }
                if(count1 != count2){
                    isAnagram = false;
                    break;
                }
            }
        }
        System.out.println(isAnagram? "Anagram" : "Not Anagram");
    }
}
