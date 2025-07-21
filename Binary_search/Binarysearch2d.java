package Binary_search;

import java.util.Scanner;
import java.util.Arrays; // Added Arrays import for System.out.println(Arrays.toString)

public class Binarysearch2d { // This is your ONE and ONLY class declaration

    public static void main(String[] args) {
        int [][] arr ={{10,20,30,40},{15,25,35,45},{28,29,37,39},{33,34,38,50}};
        System.out.println("Array 1 Length: " + arr.length); // Added context to print
        Scanner sc = new Scanner(System.in);

        System.out.println("Elements of Array 1:");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the target element to search in Array 1: ");
        int target = sc.nextInt();
        System.out.println("Result for Array 1: " + Arrays.toString(search(arr,target))); // Use Arrays.toString

        int arr1[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        System.out.println("\nElements of Array 2:"); // Added newline for clarity
        for (int i=0;i<arr1.length;i++){ // Corrected loop to use arr1.length
            for(int j=0;j<arr1[i].length;j++){ // Corrected loop to use arr1[i].length
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the target element to search in Array 2: ");
        int target1 = sc.nextInt();

        // You'll need to call search1 or binarysearch here if you want to use the second array
        // Example:
        // System.out.println("Result for Array 2 (using search1): " + Arrays.toString(search1(arr1, target1)));
        // Or if you only need binarysearch with specific row/col:
        // System.out.println("Result for Array 2 (using binarysearch on first row): " + Arrays.toString(binarysearch(arr1, 0, 0, arr1[0].length - 1, target1)));

        sc.close(); // Good practice to close scanner
    }

    // This method searches a matrix where rows and columns are sorted.
    public static int[] search (int [][]arr, int target){
        int r=0;
        int c=arr[0].length-1; // Fix: Use arr[0].length-1 for initial column if arr is 2D
        while (r<arr.length && c >= 0){
            if (arr[r][c]==target){
                return new int []{r,c};
            }
            if (arr[r][c]>target) {
                c--;
            }
            else{
                r++;
            }
        }
        return new int []{-1,-1};
    }

    // This method performs binary search on a specific row of a 2D array.
    public static int [] binarysearch(int [][] arr1, int row , int cstart , int cend ,int target1){
        while(cstart<=cend){
            int mid = cstart + (cend-cstart)/2;
            if(arr1[row][mid]==target1){
                return new int[]{row,mid};
            }
            if (arr1[row][mid]<target1) {
                cstart=mid+1;
            }
            else{
                cend=mid-1;
            }
        }
        return new int []{-1,-1}; // Fix: Missing return statement if target not found
    }

    // This method attempts to search a 2D sorted array (more complex logic)
    public static int [] search1(int[][]arr1,int target1){
        int row = arr1.length;
        int col = arr1[0].length;
        int rstart = 0;
        int rend = row-1;
        int cmid = col/2; // Middle column

        if (row ==1){
            return binarysearch(arr1,0,0,col-1,target1);
        }

        // Logic for handling multiple rows - this part needs careful review for correctness
        while(rstart <= rend - 1) { // Reduce search space to 2 rows
            int rmid = rstart + (rend - rstart) / 2;
            if (arr1[rmid][cmid] == target1) {
                return new int[]{rmid, cmid};
            }
            if (arr1[rmid][cmid] < target1) {
                rstart = rmid; // Discard top half
            } else {
                rend = rmid; // Discard bottom half
            }
        }

        // Now you have two rows remaining, apply binary search on them
        // Check if target is in the middle column of the two remaining rows
        if (arr1[rstart][cmid] == target1) {
            return new int[]{rstart, cmid};
        }
        if (arr1[rstart+1][cmid] == target1) {
            return new int[]{rstart+1, cmid};
        }

        // Search in 4 halves
        // Search in 1st half
        if (target1 <= arr1[rstart][cmid - 1]) { // Typo fix: targert1 -> target1
            return binarysearch(arr1, rstart, 0, cmid - 1, target1);
        }
        // Search in 2nd half
        if (target1 >= arr1[rstart][cmid + 1] && target1 <= arr1[rstart][col - 1]) { // Typo fix: targert1 -> target1
            return binarysearch(arr1, rstart, cmid + 1, col - 1, target1);
        }
        // Search in 3rd half
        if (target1 <= arr1[rstart + 1][cmid - 1]) { // Typo fix: targert1 -> target1
            return binarysearch(arr1, rstart + 1, 0, cmid - 1, target1);
        }
        // Search in 4th half
        if (target1 >= arr1[rstart + 1][cmid + 1] && target1 <= arr1[rstart + 1][col - 1]) { // Typo fix: targert1 -> target1
            return binarysearch(arr1, rstart + 1, cmid + 1, col - 1, target1);
        }

        return new int []{-1,-1}; // Return -1 if not found after all checks
    }
}