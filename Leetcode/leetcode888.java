package Leetcode;

import java.util.Arrays;

public class leetcode888 {
    public static void main(String[] args) {
        int aliceSizes[] ={2};
        int [] bobSizes ={1,3};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice_sum=0;
        int bob_sum=0;
        for (int alice = 0; alice < aliceSizes.length; alice++) {
            alice_sum=aliceSizes[alice]+alice_sum;
        }
        for (int bob = 0; bob < bobSizes.length; bob++) {
            bob_sum=bob_sum+bobSizes[bob];
        }
        for (int loop1 = 0; loop1 < aliceSizes.length; loop1++) {
            for (int loop2 = 0; loop2 < bobSizes.length; loop2++) {
                if (alice_sum-aliceSizes[loop1]+bobSizes[loop2]==bob_sum-bobSizes[loop2]+aliceSizes[loop1]){
                    return new int []{aliceSizes[loop1],bobSizes[loop2]};
                }
            }
        }
            return new int []{-1,-1};
        }
    }

