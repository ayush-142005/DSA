package Pattern_printing;


/*public class Pattern_printing.Advance {
   public static void main(String args[]) {
       int i,j;
       int n =4;
       for (i=1;i<=4;i++){
        for (j = 1; j <= n - i; j++){
            System.out.print(" ");
        }
        for (j=1;j<=5;j++){
            System.out.print("*");
        }

        System.out.println();
       }
   }
}*/

/*public class Pattern_printing.Advance {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}*/
public class Advance {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


