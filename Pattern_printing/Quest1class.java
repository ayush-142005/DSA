package Pattern_printing;

public class Quest1class {
    public static void main(String[] args) {
       int nums[]={1,3,5,8,7,9,2,6,7,6,8,9};
        System.out.println(cost(nums));
    }
    static int cost (int nums []){
        int n = nums.length;
        int i =0;
        int jump=0;
        int cost=0;
        while (i==n-1){
            if (nums[jump]<n){
                jump=jump+nums[jump];
                cost++;
            }
            else{
                jump--;
            }
        }
        return cost;
    }
}
