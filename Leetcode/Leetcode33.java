package Leetcode;

public class Leetcode33 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    public static int search(int [] nums , int target){
       int pivot = Pivot(nums);
       if (pivot==-1){
        return BinarySearch(nums, target,0,nums.length-1);
       }
       else{
            if (nums[pivot]==target){
                return pivot;
            }
            if (target>=nums[0]) {
                return BinarySearch(nums,target,0,pivot-1);
            }
            else{
                return BinarySearch(nums, target,pivot-1,nums.length-1);
            }
       }
    }
    public static int BinarySearch(int nums[], int target,int start, int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target==nums[mid]){
                return mid;
            }
            else if (target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static int Pivot(int[]nums) {
        int start =0;
        int end = nums.length -1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }
            if (nums[start]>nums[mid]){
                end = mid -1;
            }
            else {
                start = mid + 1 ;
            }
        }
        return -1;
    }
        static int findpivotdup(int arr[]){
        int start = 0;
        int end = arr.length;
        int mid = start+(end-start)/2;
            while (start<end){
                if (end>mid && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if (mid>start && arr[mid]<arr[mid-1]){
                    return mid-1;
                }
                
                if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                    if (arr[start]>arr[start+1]){
                        return start;
                    }
                    start++;
                    
                    if (arr[end]<arr[end-1]){
                        return end -1;
                    }
                    end--;
                } else if (arr[start]<arr[mid] || (arr[start]==arr[end] && arr[mid]>arr[end])) {
                    start=mid +1;
                }else{
                    end=mid-1;
                }
            }
            return -1;
        }
}
