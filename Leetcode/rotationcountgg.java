package Leetcode;

public class rotationcountgg {
    public static void main(String[] args) {
        int arr [] ={4,5,6,7,1,2,3};
        System.out.println(count(arr));
    }
    public static int count(int [] arr){
        int pivot_=Pivot(arr);
        return pivot_ +1;
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
}
