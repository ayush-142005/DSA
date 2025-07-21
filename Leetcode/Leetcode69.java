package Leetcode;

public class Leetcode69 {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }
    static int sqrt(int target){
        if (target==0){
            return 0;
        }
//        long ans=1;
//        for (long i = 1; i < x; i++) {
//            if(i*i==x){
//                return (int) i;
//            }
//            if (i*i<x){
//                ans=i;
//            }
//            else{
//                break;
//            }
//        }
//        return (int) ans;
        long start =1;
        long end = target;
        long mid=0;
        while(start<end){
            mid =start+(end-start)/2;
            if (mid*mid==target){
                return (int)mid;
            }
            if (mid*mid>target){
                end=mid-1;
            }
            else {
                start=start+1;
            }
        }
        return (int) end;
    }
}
