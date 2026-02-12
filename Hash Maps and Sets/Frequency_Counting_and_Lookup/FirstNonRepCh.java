package Frequency_Counting_and_Lookup;

import java.util.HashMap;

public class FirstNonRepCh {
    public static void main(String[] args) {
        String s = "ashar";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(int i =0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                System.out.println("Index : " + s.charAt(i));
                break;
            }
        }
    }
}

/*
Note for me :
first i created a string named ashar then created map name hashmap with character key and interger value mean no
of time that particualar character is appeared.
example
a - 2
s - 1
h - 1
r - 1
first loop Counting frequency
It converts the string into a character array:
['a','s','h','a','r']
example
map.getOrDefault('a',0) = 0
0 + 1 = 1
map.put('a',1)
a=1
Second loop — Finding first non-repeating character
if(map.get(s.charAt(i))==1){
Check if this character occurs exactly once in the string
 */