package Array;/*public class array {
    public static void main(String[] args) {
        int [] marks =new int[3];
        marks[0]=12;
        marks[1]=7;
        marks[2]=13;
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}*/

/*import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }
    }
}*/

/*import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] =new int[size];
        for (int i=0; i<size;i++){
            num[i] =sc.nextInt();
        }
        int find = sc.nextInt();
        for (int i=0;i<size;i++){
            if (num[i]==find){
                System.out.println(i);
            }
        }
    }
}*/

// Kunal Kushwaha

/*import java.lang.reflect.Array;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr []= {23,45,233,56,3};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
         int arr2 [] = new int[5];
        for (int j =0 ; j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
         System.out.println(java.util.Arrays.toString(arr2));
   
        String str[] = new String[4];
        for(int i=0;i<str.length;i++){
        str[i]=sc.next();
        }
        System.out.println(java.util.Arrays.toString(str));
    }
}*/

/*public class array {
    public static void change_ (int arr[]){
        arr[1]=15;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};  
        System.out.println(java.util.Arrays.toString(arr));
        change_(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

}*/
// Swapping
/* 
public class array {
    public static void swap(int arr[],int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;

    }
    public static void main(String[] args) {
       int arr []={1,2,3,4,5,6} ;
        swap(arr, 0, 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
*/
// Max 
/*public class array {
    public static void swap(int arr[],int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
    public static int max(int []arr, int start , int end ){
        int max = arr[start];
        for (int i = 0; i < end; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void reverse(int arr[]){
        int start=0;
        int end = arr.length-1;
        swap(arr, start, end);
        start++;
        end--;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(max(arr, 0, 5));
        reverse(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }
}*/

public class array {
    public static void main(String[] args) {
        System.out.println("Ayush");
    }
}