package Pattern_printing;

/*public class Pattern_printing.Function {
    public static void printname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printname(name);
    }
}*/

/*public class Pattern_printing.Function {
    public static int sum_(int a , int b){
        int sum1=a+b;
        return sum1;
    }

    public static void main(String[] args) {
        int a=10;
        int b=15;
        int sum = sum_(a, b);
        System.err.println("Sum is: " + sum);
    }
}*/

public class Function {
    public static int fact (int n){
        if (n==0 || n==1){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            int fact_=1;
           for(int i=2;i<=n;i++){
            fact_=fact_*i;
           }
           return fact_;
        }
    }
    public static void main(String[] args) {
        int a=fact(5);
        System.err.println(a);
    }
    
}
