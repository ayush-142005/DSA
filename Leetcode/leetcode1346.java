package Leetcode;

import java.util.Arrays;

public class leetcode1346 {
    public static void main(String[] args) {
        int arr[]={-10,12,-20,-8,15};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i!=j){
                    if (arr[i]==2*arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
