package Pattern_printing;

//Question 1
/*public class Pattern_printing.Ex1 {
    public static int num(int a,int b,int c){
        int sum = (a+b+c)/3;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(num(3,4,7));
    }
}
*/
/* 
// Question 2
public class Pattern_printing.Ex1 {
    public static int sumodd(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            if (i%2==1){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumodd(10));
    }
}
*/

//Question 3
/*public class Pattern_printing.Ex1 {
    public static void greater(int a, int b){
        if (a>b){
            System.out.println("A is Greater");
        }else{
            System.out.println("B is Greater");
        }
    }
    public static void main(String[] args) {
        greater(23, 90);
    }
}*/

//Question 4
/*public class Pattern_printing.Ex1 {
    public static void circle(int r) {
        double C = 2 * Math.PI * r; 
        double area = Math.PI * r * r; 
        System.out.println("Circumference: " + C); 
        System.out.println("Area: " + area);
    } 

    public static void main(String[] args) {
        circle(5); 
}
}*/

// Question 5
/*public class Pattern_printing.Ex1 {
    public static void eligible (int age){
        if (age > 18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    public static void main(String[] args) {
        eligible(19);
    }
    
}*/
// Question 6
/*public class Pattern_printing.Ex1 {
    public static void main(String[] args) {
        int n=1;
        do{
            System.err.println("Hello");
        }while(n<2);
    }
}*/

// Question 7
/*public class Pattern_printing.Ex1 {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;
       System.out.println("Press 1 to continue & 0 to stop");
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();


       while(input == 1) {
           System.out.println("Enter your number : ");
           int number = sc.nextInt();
           if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }


           System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
       }


       System.out.println("Positives : "+ positive);
       System.out.println("Negatives : "+ negative);
       System.out.println("Zeros : "+ zeros);

    }
}*/
// Question 8
/*public class Pattern_printing.Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and its power :");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int power=1;
        for (int i=1;i<=b;i++){
            power=power*a;
        }
        System.out.println(power);
    }
}*/

// Question 10
public class Ex1 {
    public static int fibo(int n){
        int a = 0 , b = 1;
        if (n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else if (n>2){
            for (int i=3;i<=n;i++){
                int temp = b;
                b=b+a;
                a=temp;
            }
            return b;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(fibo(7));

    }
}