package Leetcode;

public class Leetcode34 {
    public static int [] fun1 (int arr [],int target){
        int result []={-1,-1};
        int start = Binary(arr, target, true);
        int end = Binary(arr, target, false);

        result[0]=start;
        result[1]=end;

        return result;
    }
    public static int Binary (int [] arr,int target,boolean findstartindex ){
        int start =0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (target<arr[mid]){
                end =mid-1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                result = mid;
                if (findstartindex == true){
                    end = mid - 1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(fun1(arr, target));

    }
}
