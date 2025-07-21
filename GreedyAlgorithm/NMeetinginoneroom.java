package GreedyAlgorithm;

//import java.util.Arrays;
//import java.util.Comparator;
//
//
//public class NMeetinginoneroom {
//    public static int maxMeetings(int start[], int end[]) {
//       int [][] meet = new int [start.length][2];
//        for (int i = 0; i < start.length; i++) {
//            meet[i][0]=start[i];
//            meet[i][1]=end[i];
//        }
//        Arrays.sort(meet, Comparator.comparingInt(a -> a[1]));// sorted by end point !!
//        int count =1;
//        int last = meet[0][1];
//        for (int i = 1; i < start.length; i++) {
//            if (meet[i][0]>last){
//                count++;
//                last=meet[i][1];
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int start[] ={1, 3, 0, 5, 8, 5};
//        int end[]={2, 4, 6, 7, 9, 9};
//        System.out.println(maxMeetings(start,end));
//    }
//}

public class NMeetinginoneroom {
    public static void main(String[] args) {

    }
}
