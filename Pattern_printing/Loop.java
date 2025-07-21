package Pattern_printing;

import java.util.*;

/*public class Pattern_printing.Loop {
    public static void main(String[] args) {
        for (int i =0;i<11;i++){
            System.out.println(i);
        }
    }
}*/

/*public class Pattern_printing.Loop {
    public static void main(String[] args) {
        for (int i=0;i<11;i++){
            System.out.print(i+" ");
        }
    }
}*/

/*public class Pattern_printing.Loop {
    public static void main(String[] args) {
        int i =0;
        while (i<10) {
            System.out.println(i);
            i=i+1;
        }
    }
}*/

/*public class Pattern_printing.Loop {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
}*/

/*public class Pattern_printing.Loop {

    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}*/

public class Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n =sc.nextInt();
        for (int i=1;i<11;i++){
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }
}
