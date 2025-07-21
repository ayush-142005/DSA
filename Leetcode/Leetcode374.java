package Leetcode;

public class Leetcode374 {
    public static void main(String[] args) {

    }
    static int guessNumber(int num,int target) {
        int start =1;
        int end = num;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target==mid){
                return mid;
            }
            if (target>mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
