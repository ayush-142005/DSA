package Pattern_printing;/*public class Pattern_printing.Advance2 {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(4-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 4 - 1; i >= 1; i--)
        { 
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

public class Advance2 {
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =3;i>=1;i--){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
