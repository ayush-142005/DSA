package Leetcode;

public class Leetcode1295 {
    public static int findN(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static int count(int num){
        int count = 0 ;
        while (num>0) {
            count ++;
            num/=10;
        }
        return count;
    }
    public static boolean even(int num){
        int numberofdigits = count(num);
        if (numberofdigits%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr [] ={12,345,2,6,7896};
        System.err.println(findN(arr));
    }
}
