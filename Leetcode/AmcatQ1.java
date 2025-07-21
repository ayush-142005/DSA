package Leetcode;

public class AmcatQ1 {
    public static int fun(String statement){
        char str[] = statement.toCharArray();
        char str1[]={'!','@','#','$','%','^','&','*','(',')'};
        int error =0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str1.length; j++) {
                if (str[i]==str1[j]){
                    error++;
                }
            }
        }
        return error;
    }
    public static void main(String[] args) {
        String str ="Ayush@2005";
        System.out.println(fun(str));
    }
}
