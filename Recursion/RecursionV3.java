package Recursion;// Q1 : wheather the arr is sorted or not
//public class Recursion.RecursionV3 {
//    public static void main(String[] args) {
//        int arr [] = {1,2,3,4,5};
//        System.out.println(sorted(arr));
//    }
//    static boolean sorted(int arr[]){
//        return helper(arr,0);
//        }
//    static boolean helper(int []arr,int index){
//        if (index==arr.length-1){
//            return true;
//        }
//        if(arr[index]<arr[index+1] && index<arr.length){
//            return helper(arr,index+1);
//        }
//        return false;
//    }
//}

// Q2 Linear search
//public class Recursion.RecursionV3 {
//    public static void main(String[] args) {
//        int arr [] ={1,3,5,6,9,8,8,8};
//        System.out.println(find(arr,8));
//        System.out.println(findallIndex(arr,8,0));
//    }
//    static int find(int arr[] , int target){
//        return helper(arr ,target , 0);
//    }
//    static int helper(int arr[] , int target , int index){
//        if (arr.length==index){
//            return -1;
//        }
//        if (arr[index]==target){
//            return index;
//        }
//        return helper(arr, target, index+1);
//    }
//
//    static ArrayList<Integer> l = new ArrayList<>();
//    static ArrayList findallIndex(int arr[] , int target,int index ){
//        if (index==arr.length){
//            return l;
//        }
//        if (arr[index]==target){
//            l.add(index);
//        }
//        return findallIndex(arr, target,index+1);
//    }
//
//}

// Q3 Rotating binary arr

public class RecursionV3 {
    public static void main(String[] args) {
        int arr [] = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,9,0,arr.length));
        int arr1[] = {7,8,9,1,2,3,4,5};
        System.out.println(search(arr1,7,0,arr1.length));
    }
    static int search (int [] arr , int target , int s , int e){
        if (s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if (arr[mid]== target){
            return mid;
        }
        if (arr[s]<=arr[mid]){
            if (arr[s]<=target && arr[mid]>=target){
                return search(arr,target,s,mid-1);
            }
            else{
                return search(arr,target,mid+1,e);
            }
        }
        else {
            if(target<=arr[e] && target<=arr[mid]){
                return search(arr,target,s,mid-1);
            }
            else {
                return search(arr,target,mid+1,e);
            }
        }

    }
}