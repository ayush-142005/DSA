package Sorting;

public class Selectionsort {
    public static void main(String[] args) {
        int [] arr = {};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
    public static void sort(int arr []){
        for (int i = 0; i < arr.length; i++) {
            int max = 1;
            for (int j = 0; j < arr.length-i; j++) {
                 if (arr[max]<arr[i]){
                    max = j;
                 }
            }
            int temp = arr[arr.length-1-i];
            arr [arr.length-1-i]= arr[max];
            arr[max]=temp;
        }
    }
}
