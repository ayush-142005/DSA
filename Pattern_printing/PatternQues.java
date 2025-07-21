package Pattern_printing;

public class PatternQues {
    public static void main(String[] args) {
//        pattern1(5);
//        System.out.println();
//        pattern2(5);
//        System.out.println();
//        pattern3(5);
//        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
    }
//    static void pattern1(int n){
//        for (int row = 1; row <=n; row++) {
//            for (int col = 1; col <=row; col++) {
//                System.out.print("X ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern2(int n){
//        for (int row = 1; row <=n; row++) {
//            for (int col = 1; col <=n ; col++) {
//                System.out.print("X ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern3(int n){
//        for (int row = 1; row <=5 ; row++) {
//            for (int col = 1; col <= n-row+1 ; col++) {
//                System.out.print("X ");
//            }
//            System.out.println();
//        }
//    }
    static void pattern4(int n){
        for (int row = 0; row < 2*n; row++) {
            if (row<=n){
                for (int col = 1; col <=row; col++) {
                    System.out.print("X ");
                }
            }
            else{
                for (int col = 1; col <2*n-row+1; col++) {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row =0; row < 2*n; row++) {
            if (row<=n) {
                for (int col = 0; col < n - row; col++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < 2 * row + 1; col++) {
                    System.out.print("*");
                }
            }
            else {
                for (int col = 0; col < row-n; col++) {
                    System.out.print(" ");
                }
                for (int col = 0; col <n-(row-n) ; col++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
