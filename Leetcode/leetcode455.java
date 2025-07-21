package Leetcode;

import java.util.Arrays;

public class leetcode455 {
    public static int findContentChildren(int[] greed, int[] size_cookie) {
        int j =0;
        int i=0;
        Arrays.sort(greed);
        Arrays.sort(size_cookie);
        while(i < greed.length){
            while(j < size_cookie.length && greed[i] > size_cookie[j]){
                j++;
            }
            if (j == size_cookie.length){
                break;
            }
            i++;
            j++;
        }
        return i;
    }
    public static void main(String[] args) {
        int [] g={1,2,3};
        int [] s={1,1};
        System.out.println(findContentChildren(g,s));
    }
}
