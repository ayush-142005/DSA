package Leetcode;

public class leetcode1572 {
    public static void main(String[] args) {
        int arr [][] = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
        System.out.println(diagonal(arr));
    }
    static int diagonal(int arr [][]){
        int sum =0;
        int right = arr.length-1;
        int left =0;
        for (int row = 0; row < arr.length; row++) {
                if (right!=-1 & left!= arr.length){
                    sum=arr[row][right]+arr[row][left]+sum;
                    left+=1;
                    right-=1;
                }
        }
        if (arr.length%2==1){
            sum-=arr[arr.length/2][arr.length/2];
        }
        return sum;
    }
}
