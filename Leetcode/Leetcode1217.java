package Leetcode;

public class Leetcode1217 {
    public static void main(String[] args) {
        int[] position = {2, 2, 2, 3, 3};
        System.out.println(minCostToMoveChips(position));
    }

    public static int minCostToMoveChips(int[] position) {
        int evencost = 0;
        int oddcost = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                evencost++;
            } else {
                oddcost++;
            }
        }
        return Integer.min(evencost, oddcost);
    }
}
