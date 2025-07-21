package Leetcode;//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static java.util.Arrays.compare;
//import static java.util.Arrays.sort;

//public class Leetcode.Leetcode88 {
//    public static void main(String[] args) {
//        int n1 []={1,2,3,0,0,0};
//        int n2 [] ={2,5,6};
//        System.out.println(Arrays.toString(merge(n1,3,n2,3)));
//        int arr1[]={};
//        int arr2[]={};
//        System.out.println(Arrays.toString(merge(arr1,0,arr2,1)));
//    }
//    static int [] merge(int[] nums1, int m, int[] nums2, int n) {
//        List<Integer> l1=new ArrayList<>();
//        int arr [] = new int[m+n];
//        for (int num_1 = 0; num_1 < nums1.length; num_1++) {
//            if(nums1[num_1]!=0){
//                l1.add(nums1[num_1]);
//            }
//        }
//        for (int num_2 = 0; num_2 < nums2.length; num_2++) {
//            if(nums1[num_2]!=0){
//                l1.add(nums2[num_2]);
//            }
//        }
//        for (int i = 0; i < l1.size(); i++) {
//            arr[i]=l1.get(i);
//        }
//
//        return sort_(arr);
//    }
//    static int [] sort_ (int [] arr){
//        if(arr.length==1){
//            return arr;
//        }
//        if (arr==null){
//            return new int[0];
//        }
//        int mid = arr.length/2;
//        int [] left = sort_(Arrays.copyOfRange(arr,0,mid));
//        int [] right=sort_(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return sort(left , right);
//    }
//    static int [] sort(int left [],int right[]){
//        int arr_big [] =new int [left.length+right.length];
//        int left_p=0;
//        int right_p=0;
//        int big_p=0;
//        while(left_p<left.length && right_p<right.length){
//            if (left[left_p]>right[right_p]){
//                arr_big[big_p]=right[right_p];
//                right_p++;
//                big_p++;
//            }
//            else{
//                arr_big[big_p]=left[left_p];
//                left_p++;
//                big_p++;
//            }
//        }
//        while (left_p<left.length){
//            arr_big[big_p]=left[left_p];
//            left_p++;
//            big_p++;
//        }
//        while(right_p<right.length){
//            arr_big[big_p]=right[right_p];
//            right_p++;
//            big_p++;
//        }
//        return arr_big;
//    }
//
//}

import java.util.Arrays;

public class Leetcode88 {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        System.out.println(Arrays.toString(merge(nums1,3,nums2,3)));
    }
    static int [] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int mix []=new int[m+n];
        while (i < nums1.length && j < nums2.length) {
                if (nums1[i] > nums2[j]) {
                    if (nums2[j]==0){
                        j++;
                        break;
                    }
                    mix[k] = nums2[j];
                    k++;
                    j++;
                } else {
                    if (nums2[i]==0){
                        i++;
                        break;
                    }
                    mix[k] = nums1[i];
                    i++;
                    k++;
                }
            }
            while (i < nums1.length) {
                if(nums1[i]==0){
                    break;
                }
                mix[k] = nums1[i];
                k++;
                i++;
            }
            while (j < nums2.length) {
                if(nums2[j]==0){
                    break;
                }
                mix[k] = nums2[j];
                k++;
                j++;

        }
        return mix;
    }
}
