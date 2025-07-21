package GreedyAlgorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Maximum_Meetings_in_One_Room {
    public static ArrayList<Integer> maxMeetings(int N, int[] start, int[] end) {
        int [][] meet = new int [start.length][3];
        for (int i = 0; i < start.length; i++) {
            meet[i][0]=start[i];
            meet[i][1]=end[i];
            meet[i][2]=i+1; // Acting as sequence number
        }
        Arrays.sort(meet, Comparator.comparingInt(a -> a[1]));
        ArrayList<Integer> seq_meet = new ArrayList<>();
        int last = -1;
        for (int i = 0; i < start.length; i++) {
            if(meet[i][0]>last && i!=0) {
                seq_meet.add(meet[i][2]);
                last=meet[i][1];
            }
        }
        return seq_meet;
    }
    public static void main(String[] args) {
        int start [] ={1,3,0,5,8,5};
        int end [] ={2,4,6,7,9,9};
        System.out.println(maxMeetings(6,start,end));

    }
}
