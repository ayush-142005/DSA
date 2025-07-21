package Leetcode;

public class leetcode410 {
    public static void main(String[] args) {
        int arr [] ={7,2,5,10,8};
        System.out.println(split(arr,2));
    }
    static int split(int [] arr,int s){
        int start =0;
        int end =0;
        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);
            end=end+arr[i];
        }
        while (start<end){
            int mid = start+(end-start)/2;
            int sum =0;
            int piece=1;
            for (int i = 0; i < arr.length; i++) {
                if(sum+arr[i]>mid){
                    sum=arr[i];
                    piece++;
                }
                else{
                    sum+=arr[i];
                }
            }
            if(piece>s){
                start = mid + 1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }

}
