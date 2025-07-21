package Recursion;//public class Recursion.RecursionV4 {
//    public static void main(String[] args) {
//        triangle2(5,0);
//    }
//    static void triangle2(int r, int c) {
//        if (r == 0) {
//            return;
//        }
//        if (c < r) {
//            triangle2(r, c+1);
//            System.out.print("*");
//        } else {
//            triangle2(r-1, 0);
//            System.out.println();
//        }
//    }
//
//    static void triangle(int r, int c) {
//        if (r == 0) {
//            return;
//        }
//        if (c < r) {
//            System.out.print("*");
//            triangle(r, c+1);
//        } else {
//            System.out.println();
//            triangle(r-1, 0);
//        }
//    }
//}

// Bubble Sort

//import java.util.Arrays;
//
//public class Recursion.RecursionV4 {
//    public static void main(String[] args) {
//        int arr [] = {6,5,4,3,2,1};
//        bubblesort(arr, arr.length-1, 0);
//        System.out.println(Arrays.toString(arr));
//
//    }
//    static void bubblesort(int arr [] , int row , int col){
//        if (row==0){
//            return;
//        }
//        if (col<row){
//            if (arr[col]>arr[col+1] ){
//                int temp = arr[col];
//                arr[col]=arr[col+1];
//                arr[col+1]=temp;
//            }
//          bubblesort(arr,row,col+1);
//        }else{
//            bubblesort(arr,row-1,0);
//        }
//    }
//}

// selection sort

import java.util.Arrays;

public class RecursionV4 {
    public static void main(String[] args) {
        int arr [] = {6,5,4,3,2,1};
        selectiosort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectiosort(int arr [] ,int row , int col ,int max){
        if (row==0){
            return;
        }
        if (row>col){
                if (arr[col]>arr[max]){
                    selectiosort(arr,row,col+1,col);
                }else {
                    selectiosort(arr,row,col+1,max);
                }

        }else{
            int temp = arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            selectiosort(arr,row-1,0,0);
        }
    }
}