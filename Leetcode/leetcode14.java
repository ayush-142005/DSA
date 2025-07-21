package Leetcode;

public class leetcode14 {
    public static void main(String[] args) {
        String arr[] = {"flower","flow","flight"};
        System.out.println(prefix(arr));
    }
    static String prefix (String arr[]){
        String prefix_=arr[0];
        if (arr.length==0){
            return "";
        }
        for (int i = 1; i < arr.length ; i++) {
            while (arr[i].indexOf(prefix_)!=0){
                prefix_=prefix_.substring(0,prefix_.length()-1);
            }
            if(prefix_.isEmpty()){
                return "";
            }
        }
        return prefix_;
    }
}
