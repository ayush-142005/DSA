package Leetcode;

public class Leetcode1095 {
    public static int search (int arr [], int target){
        int peak = mountain(arr);
        int firsttry = BinarySearch(arr,target,0,peak);
        if (firsttry !=-1){
            return firsttry;
        }
        else{
            return oabs(arr, target, peak+1, arr.length-1);
        }
    }
    public static int mountain(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            } 
        }
        return start ;   
    }
    public static int BinarySearch(int [] arr , int target,int start , int end){
        while (start<=end) {
            int mid = start +(end - start)/2;
            if (arr[mid]>target){
                end = mid -1;
            }
            else if (arr[mid]<target){
                start = mid + 1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
    public static int oabs(int [] arr , int target,int start , int end){
        while (start<=end) {
            int mid = start +(end - start)/2;
            if (arr[mid]>target){
                start = mid + 1;
            }
            else if (arr[mid]<target){
                end = mid -1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
}
