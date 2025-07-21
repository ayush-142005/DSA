package Leetcode;

public class Leetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(144));
    }
    static boolean isPerfectSquare(int num){
//        if (num == 0 || num == 1) {
//            return true;
//        }
//        for (long i = 0; i < num; i++) {
//            if (i*i == num){
//                return true;
//            }
//        }
//        return false;

        // Binary search
        if (num==0||num==1){
            return true;
        }
        long start = 0;
        long end = num;
        while (start<=end){
            long mid = start+(end-start)/2;
            if(mid * mid == num){
                return true;
            }
            if (mid*mid<num){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
