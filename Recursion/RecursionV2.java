package Recursion;
// Q1 :
//public class Recursion.RecursionV2 {
//    public static void main(String[] args) {
//        fun(5);
//    }
//    static void fun(int n){
//        if (n==0){
//            return ;
//        }
//
//        System.out.println(n);
//        fun(n-1);
//    }
//}

//public class Recursion.RecursionV2 {
//    public static void main(String[] args) {
//        fun(5);
//    }
//    static void fun(int n){
//        if (n==0){
//            return;
//        }
//        fun(n-1);
//        System.out.println(n);
//    }
//}

// Q3 Fact
//public class Recursion.RecursionV2 {
//    public static void main(String[] args) {
//        System.out.println(fact(5));
//    }
//    static int fact(int n){
//        if (n==0){
//            return 1;
//        }
//        if (n==1){
//            return 1;
//        }
//        return n*fact(n-1);
//    }
//}

// Q4 : sum of digit

//public class Recursion.RecursionV2 {
//    public static void main(String[] args) {
//        System.out.println(sum(1234));
//    }
//    static int sum(int n){
//        if(n==0){
//            return 0;
//        }
//        return n%10 + sum(n/10);
//    }
//}

// concept
//public class Recursion.RecursionV2 {
//    public static void main(String[] args) {
//        fun(5);
//    }
//    static void fun(int n){
//        if (n==0){
//            return;
//        }
//        System.out.println(n);
//        fun(n--);
//        // fun(--n)
//    }
//}

// Q5: Reverse a Number

//public class Recursion.RecursionV2 {
//    public static void main(String[] args) {
//       fun(123);
//        System.out.println(sum);
//    }
//    // m1
//    static int sum = 0;
//    static void fun(int n){
//        if (n==0){
//            return ;
//        }
//        int rem = n%10;
//        sum=sum*10+rem;
//        fun(n/10);
//    }
//    //m2
//}

//Q6 count zero

//public class Recursion.RecursionV2 {
//    static int zero = 0;
//    public static void main(String[] args) {
//        countzero(3020400);
//        System.out.println(zero);
//        System.out.println(countz(10000));
//    }
//    //m1
//    static void countzero(int n){
//        if (n==0){
//            return ;
//        }
//        int rem=n%10;
//        if(rem==0){
//            zero++;
//        }
//        countzero(n/10);
//    }
//    static int countz(int n){
//        return helper(n,0);
//    }
//    static int helper(int n , int c){
//        if (n==0){
//            return c;
//        }
//        int rem = n%10;
//        if (rem == 0){
//            return helper(n/10,c+1);
//        }
//        return helper(n/10,c);
//    }
//}

public class RecursionV2 {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    static int fibo (int n){
        if (n<=1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}