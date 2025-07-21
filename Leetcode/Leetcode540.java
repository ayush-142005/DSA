package Leetcode;

public class Leetcode540 {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2}; // this test case
        System.out.println(singleNonDuplicate(nums));
        int nums1[]={1};
        System.out.println(singleNonDuplicate(nums1));
    }

//    static int singleNonDuplicate(int[] nums) { // .ArrayIndexOutOfBoundsException
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1] && mid < nums.length) {
//                return nums[mid];
//            }
//            if (nums[mid] == nums[mid - 1] || nums[mid] == nums[mid + 1] && mid < nums.length) {
//                if (mid % 2 == 1 && nums[mid] != nums[mid - 1]) {
//                    left = mid + 1;
//                } else {
//                    right = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }

//    static int singleNonDuplicate(int[] nums) { // youtube
//        int left =0;
//        int right = nums.length;
//        while(left<right){
//            int mid = left+(right-left)/2;
//            if (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
//                return nums[mid];
//            }
//            if (mid%2==1){
//                    mid--;
//                }
//            if(nums[mid]==nums[mid+1]){
//                left=mid+1;
//            }
//            else
//            {
//            right=mid;
//            }
//            }
//        return nums[left];
//        }

//    static int singleNonDuplicate(int[] nums){ // Array index out of bound
//        int even_indx=0;
//        int odd_indx=1;
//        while (even_indx< nums.length || odd_indx< nums.length){
//            if (nums[even_indx]==nums[odd_indx]){
//                even_indx+=2;
//                odd_indx+=2;
//            }
//            else {
//                return even_indx;
//            }
//
//        }
//        return -1;
//    }
static int singleNonDuplicate(int[] nums){
        int start =0;
        int end = nums.length-1;
        if (nums.length==1){
            return nums[0];
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if (mid==0 && nums[0]!=nums[1]){
                return nums[mid];
            }
            if ((mid > 0 && nums[mid] != nums[mid - 1]) && (mid < nums.length - 1 && nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }
            if (mid==nums.length-1 && nums[nums.length-1]!=nums[nums.length-2]){
                return nums[nums.length-1];
            }
            if (mid%2==0){
                if (nums[mid-1]== nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid-1]==nums[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
    return -1;
    }
}
//    }

