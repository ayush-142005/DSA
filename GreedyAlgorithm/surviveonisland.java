package GreedyAlgorithm;

public class surviveonisland {
    static int minimumDays(int survive_day, int maxi_unit_day , int req_each_day) {
        int no_sunday = survive_day/7;
        int no_buying = survive_day-no_sunday;
        int total_food=survive_day*req_each_day;
        int ans=0;
        if(total_food%maxi_unit_day==0){
            ans=total_food/maxi_unit_day;
        }
        else{
            ans=total_food/maxi_unit_day+1;
        }
        if(survive_day>7) {
            if ((long) 6 * maxi_unit_day < (long) 7 * req_each_day) {
                return -1; // Cannot stock enough food to last through a Sunday
            }
        }
        if (ans<=no_buying){
            return ans;
        }
        else {
            return -1;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(minimumDays(10,16,2));
        System.out.println(minimumDays(10,9,8));
    }
}
