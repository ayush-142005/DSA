package Recursion;
//public class Recursion.RecursionV1 {
//    public static void main(String[] args) {
//        message();
//    }
//    static void message(){
//        System.out.println("Ayush");
//        message1();
//    }
//    static void message1(){
//        System.out.println("Ayush");
//        message2();
//    }
//    static void message2(){
//        System.out.println("Ayush");
//        message3();
//    }
//    static void message3(){
//        System.out.println("Ayush");
//        message4();
//    }
//    static void message4(){
//        System.out.println("Ayush");
//    }
//}
//public class Recursion.RecursionV1 {
//    public static void main(String[] args) {
//        print(1);
//    }
//    static  void print(int n){
//        if (n==5){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n);
//        print(n+1);
//    }
//}

//public class Recursion.RecursionV1 {
//    public static void main(String[] args) {
//        System.out.println(fibo(5));
//    }
//    static int fibo(int n){
//        if (n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }
//}

public class RecursionV1 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,6,0,arr.length));
    }
    static int search (int arr[],int target,int start , int end){
          if (start>end){
              return -1;
          }
          int mid = start+(end-start)/2;
          if (arr[mid]==target){
              return mid;
          }
          if (target>arr[mid]){
              return search(arr,target,mid+1,end);
          }
              return search(arr,target,start,mid-1);
    }
}

