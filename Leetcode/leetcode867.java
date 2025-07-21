package Leetcode;

import java.util.Arrays;

public class leetcode867 {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    static int [][] transpose(int arr [][]){
        int[][] trans =new int[arr[0].length][arr.length];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                trans[col][row] = arr[row][col];
            }
        }
        return trans;
    }
}
