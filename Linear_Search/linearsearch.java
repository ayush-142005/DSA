package Linear_Search;/*public class Linear_Search.linearsearch {
    public static int Linear(int arr[], int search) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {18, 12, 9, 14, 77, 50};
        System.out.println(Linear(arr, 14)); 
        System.out.println(Linear(arr, 100)); 
    }
}*/

/*
public class Linear_Search.linearsearch {
    static boolean Linear(String name, char search){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (search==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Ayush";
        char search ='y';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Linear(name, search));
    }
}
*/

/*public class Linear_Search.linearsearch {
    static boolean Linear(String name , char target, int start, int end){
        if (name.length()==0){
            return false;
        }
        for (int i = start; i < end; i++) {
            if (target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      String name = "Ayush Sanjay Hood";
      char target = 'S';
       System.out.println(Linear(name, target,2, 10));
    }
}*/

public class linearsearch {
    public static int [] search (int arr[][],int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1};
    }

    static int max (int [][]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
        int target = 11;
        int [] ans =search(arr, target);
        System.out.println(java.util.Arrays.toString(ans));
        int ans1 =max(arr);
        System.out.println(ans1);
    }
}





