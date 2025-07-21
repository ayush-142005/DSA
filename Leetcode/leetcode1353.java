package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode1353 {
    public static int maxEvents(int[][] events){
        Arrays.sort(events, Comparator.comparingInt(a->a[1]));
        int last =-1;
        int count =0;
        for (int i = 0; i < events.length; i++) {
            if ((events[i-1][0]==events[i][0]) && (last == events[i][1]) && (i<0 )){
                count++;
                last=events[i][1];
            }
            else if (events[i][0]>last){
                count++;
                last=events[i][1];
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int events[][]={{1,2},{2,3},{3,4},{1,2}};
        System.out.println(maxEvents(events));

    }
}
