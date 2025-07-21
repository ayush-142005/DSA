package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode1830 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
        }
        if (set.size()==26){
            return true;
        }else{
            return false;
        }
    }
}

