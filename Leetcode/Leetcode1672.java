package Leetcode;

public class Leetcode1672 {
    public static int MaxWealth(int arr [][]){
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < arr.length; person++) {
            int sum = 0;
            for (int j = 0; j < arr[person].length; j++) {
                sum +=arr[person][j];
            }
            if (max < sum){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,2,1}};
       System.out.println( MaxWealth(arr));
    }
}