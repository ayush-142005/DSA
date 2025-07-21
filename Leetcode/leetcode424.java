package Leetcode;

public class leetcode424 {
    public static void main(String[] args) {
        String s="AABABCC";
        System.out.println(characterReplacement(s,2));
    }
    static int characterReplacement (String s, int k){
            int char_needed_tobechange = 0;
            int window_size=0;
            int maxfreq=0;
            int left=0;
            int freq []=new int [26];
            int win_length=0;
            for (int right = 0; right < s.length(); right++) {
                freq[s.charAt(right)-'A']++;
                maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
                window_size=right-left+1;
                if (window_size-maxfreq>k){
                    freq[s.charAt(left)-'A']--;
                    left++;
                }
                window_size=right-left+1;
                win_length=Math.max(window_size,win_length);
            }
            return window_size;
    }
}
