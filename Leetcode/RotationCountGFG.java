package Leetcode;

public class RotationCountGFG {
    public static void main(String[] args) {
        int arr [] = {3,4,5,1,2};
        System.out.println(rotation(arr));
    }
    static int rotation(int arr[]){
        int start =0;
        int end = arr.length-1;
        if (arr[start] <= arr[end]) {
            return arr[start];
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1] && mid<end){
                return mid +1;
            }
            if(arr[mid]<arr[mid-1] && start<mid){
                return mid-1+1;
            }
            if (arr[start]<=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
