package Binary_search;

public class BinarySearch {
    public static int oabs(int arr[],int target){
        int start =0;
        int end = arr.length -1 ;
        if (arr[start]>arr[end]){
             while (start<=end) {
                int mid = start + (end - start)/2;
                if (target==arr[mid]){
                    return mid;
                }
                else if (arr[mid]> target){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
             }
        }
        else{
            search(arr, target);
        }
        return -1;
    }
    public static int search (int arr[], int target){
        int start =0;
        int end = arr.length - 1 ;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {    
    int arr []={2,4,5,9,11,12,14,20,36,48};
    int target = 14;
    System.out.println(search(arr, target));
    int arr1[] ={48,36,20,14,12,11,9,5,4,2};
    System.out.println(oabs(arr1, target)); 
    }
}
