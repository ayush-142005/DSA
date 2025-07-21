package Leetcode;

public class leetcode1539 {
    public static void main(String[] args) {
        int []arr={2,3,4,7,11};
        System.out.println(findKthPositive_(arr,5));
    }
    static int findKthPositive(int[] arr, int k) {
        int n=1;
        int i=1;
        int arr_p=0;
        while (n!=k){
            if (arr[arr_p]==i){
                if (arr_p<arr.length) {
                    arr_p++;
                    i++;
                }
            }else {
                i++;
                n++;
            }
        }
        return i;
    }
    static int findKthPositive_(int[] arr, int k){
        int left =0;
        int right=arr.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]-(mid+1) <k){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left+k;
    }
}
