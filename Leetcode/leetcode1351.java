package Leetcode;

public class leetcode1351 {
    public static void main(String[] args) {
        int [][] grid ={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    // brute
    static int countNegatives(int[][] grid) {
        int neg =0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length ; col++) {
                if (grid[row][col]<0){
                    neg++;
                }
            }
        }
        return neg;
    }

    //
}
