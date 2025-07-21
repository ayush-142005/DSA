package String;

public class palindromeStr {
    public static void main(String[] args) {
        String Statement = "abcba";
        System.out.println(palindrome(Statement));
    }
    static boolean palindrome(String Statement){
        StringBuilder original = new StringBuilder(Statement);
        StringBuilder reversed = new StringBuilder(Statement).reverse();
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i)!=reversed.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
