package Pattern_printing;

import java.util.*;
/*public class Pattern_printing.Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if (age>18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

    }
}*/
/*public class Pattern_printing.Conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}*/
/*public class Pattern_printing.Conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("A is Greater");
        }
        else{
            System.out.println("B is Greater");
        }

    }
}*/
public class Conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hola");
                break;
            case 3:
                System.out.println("Namasta");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
