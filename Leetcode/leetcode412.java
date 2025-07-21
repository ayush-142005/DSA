package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }
    static List<String> fizzBuzz(int n){
        ArrayList<String> l1 = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if(i%3==0 && i%5==0){
                l1.add("FizzBuzz");
            } else if (i%3==0) {
                l1.add("Fizz");
            } else if (i%5==0) {
                l1.add("Buzz");
            }
            else {
                String s1= new String(String.valueOf(i));
                l1.add(s1);
            }
        }
        return l1;
    }
}
