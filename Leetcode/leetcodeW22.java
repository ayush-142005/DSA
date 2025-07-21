package Leetcode;

public class leetcodeW22 {
    public static int countTrapezoids(int[][] points) {
        int n = points.length;
        int count =0;
        if (n<4){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l <n ; l++) {
                        int [] point1 = points[i];
                        int [] point2 = points[j];
                        int [] point3 = points[k];
                        int [] point4 = points[l];

                        if (Collinear(point1,point2,point3)|| Collinear(point1,point3,point4)||Collinear(point2,point3,point4)|| Collinear(point1,point2,point4)){
                            continue;
                        }

                        int slope1=slope(point1,point2);
                        int slope2=slope(point1,point3);
                        int slope3=slope(point2,point4);
                        int slope4=slope(point3,point4);
                        int slope5=slope(point1,point4);
                        int slope6=slope(point2,point3);

                        if (slope1==slope2){
                            count++;
                        } else if (slope1==slope3) {
                            count++;
                        } else if (slope1==slope4) {
                            count++;
                        } else if (slope1==slope5) {
                            count++;
                        } else if (slope1==slope6) {
                            count++;
                        } else if (slope2==slope3) {
                            count++;
                        } else if (slope2==slope4) {
                            count++;
                        } else if (slope2==slope5) {
                            count++;
                        } else if (slope6==slope2) {
                            count++;
                        } else if (slope3==slope4) {
                            count++;
                        } else if (slope3==slope5) {
                            count++;
                        } else if (slope3==slope6) {
                            count++;
                        } else if (slope4==slope5) {
                            count++;
                        } else if (slope4==slope6) {
                            count++;
                        }else if (slope5==slope6){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static boolean Collinear(int [] point1,int [] point2,int [] point3){
        return (long)(point2[1]-point1[1])*(point2[0]-point1[0])==(long)(point2[1]-point3[1])*(point2[0]-point3[0]);
    }
    public static int slope(int [] point1 , int [] point2){
        return (point1[1]-point2[1])/(point1[0]-point2[0]);
    }

    public static void main(String[] args) {
        int arr [][] ={{1,0},{2,0},{3,0},{2,2},{3,2}};
        System.out.println(countTrapezoids(arr));
    }
}
