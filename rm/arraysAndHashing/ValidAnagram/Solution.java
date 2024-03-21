package arraysAndHashing.ValidAnagram;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "ABBA";
        String t = "BABA";
        System.out.println(isAnagram(s,t));
    }

    /*public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (char x : s.toLowerCase().toCharArray()) {
            count[x - 'a']++;
        }

        for (char x : t.toLowerCase().toCharArray()) {
            count[x - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }*/
        public static boolean isAnagram(String s, String t) {
            char[] sCharArray = s.toCharArray();
            char[] tCharArray = t.toCharArray();
            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            return Arrays.equals(sCharArray,tCharArray);
        }
}
