package Sorting;

public class Bubblesort {
    public static void  sort (int [] arr ){
        boolean swap;
        for (int i = 0; i < arr.length; i++) { // pass loop
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                    swap = true;
                }
            }
            if (swap == false){
                break;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
