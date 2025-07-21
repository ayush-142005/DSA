package Leetcode;

public class Leetcode1 {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int  target = 9;
        System.out.println(java.util.Arrays.toString(twosum(arr, target)));
    }
    public static int [] twosum (int [] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                if (i!=j){
                    sum = arr[i]+arr[j];
                    if(sum == target){
                        return new int[] {i,j};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
}
