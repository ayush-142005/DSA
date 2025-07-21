package Binary_search;

public class BinaryQuestion {
    public static void main(String[] args) {
        int []arr ={2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(Ceiling(arr, target));
        System.out.println(floor(arr, target));
    }
    // made by me
    public static int Ceiling (int[] arr, int target ){
        int start =0;
        int end =arr.length-1;
        while (start<=end){
            int mid = start+(end - start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
    public static int C1(int [] arr , int target){
        int start =0;
        int end =arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (target>arr[mid]){
                start=mid + 1;
            }
            else if (target< arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return start;

    }
    public static int floor (int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2; 
            if (target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return end;

    }
}
