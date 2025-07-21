package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode3 {
    public static void main(String[] args) {
        String s= "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        if (s==null || s.length()==0){
            return 0;
        }
        if (s.length()==1){
            return 1;
        }
        Set<Character>charSet=new HashSet<>();
        int left = 0;
        int window = 0;
        int max =0;
        for (int right = 0; right < s.length() ; right++) {
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            window=Math.max(window,right-left+1);
        }
        return window;
    }
}
