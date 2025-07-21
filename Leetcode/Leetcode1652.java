package Leetcode;

public class Leetcode1652 {
    public int[] decrypt(int[] code, int k) {
        int arr [] = new int[code.length];
        if (k==0){
            return arr;
        }

        if (k>0){
            for (int i = 0; i < code.length; i++) {
                int sum =0;
                for (int j=1; j<= k; j++) {
                    sum += code[(i+j)%code.length];
                }
                arr[i]=sum;
            }
            return arr;
        }

        else {
            for (int i = 0; i < code.length; i++) {
                int sum =0 ;
                for (int j = 1; j <= -1*k; j++) {
                    sum +=code[(i-j+code.length)%code.length];
                }
                arr[i]=sum;
            }
            return arr;
        }
    }
}
