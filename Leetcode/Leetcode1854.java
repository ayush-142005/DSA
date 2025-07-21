package Leetcode;

public class Leetcode1854 {
    public static void main(String[] args) {
        int arr [][]={{1950,1961},{1960,1971},{1970,1981}};
        int a=fun(arr);
        System.out.println(a);
    }
    static int fun(int[][] logs){
        int arr []=new int[101];
        int baseYear = 1950;

        for (int i = 0; i < logs.length; i++) {
            int by = logs[i][0];
            int dy = logs[i][1];

            arr[by-baseYear]++;
            arr[dy-baseYear]--;
        }
        int max = arr[0];
        int maxyear=1950;
        for (int i = 1; i <101 ; i++) {
            arr[i]=arr[i]+arr[i-1];
            if (max<arr[i]){
                max = arr[i];
                maxyear=i+1950;
            }
        }
        return maxyear;
    }
}