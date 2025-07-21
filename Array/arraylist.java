package Array;

/*public class Array.arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        l1.add(67);
        l1.add(17);
        l1.add(27);
        l1.add(37);
        l1.add(47);
        l1.add(57);
        l1.add(77);
        System.out.println(l1);
        System.out.println(l1.contains(77));
        l1.set(0,7);
        System.out.println(l1);
    }
}*/

/*public class Array.arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>(5);
        for (int i=0;i<5;i++){
            l1.add(sc.nextInt());
        }
        for(int j=0;j<5;j++){
            System.out.println(l1.get(j));
        }
        System.out.println(l1);
    }
}*/
/*public class Array.arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l1 = new ArrayList<>();
        // initialise
        for (int i=0;i<3;i++){
            l1.add(new ArrayList<>());
        }
        
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
            l1.get(i).add(sc.nextInt());
        }
    }
        System.out.println(l1);
    }
}*/


import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> l1 = new ArrayList<>();

        // Initialize the inner ArrayLists
        for (int i = 0; i < 3; i++) {
            l1.add(new ArrayList<>());
        }

        // Add elements to the inner ArrayLists
        for (int i = 0; i < 3; i++) {
            l1.get(i).add(sc.nextInt());
        }

        System.out.println(l1);
        sc.close(); // Close the Scanner to prevent resource leaks.
    }
}