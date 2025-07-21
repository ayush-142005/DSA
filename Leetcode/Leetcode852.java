package Leetcode;

public class Leetcode852 {
    public static int mountain(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
