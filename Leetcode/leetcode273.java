package Leetcode;//public class Leetcode.leetcode273 {
//    public static void main(String[] args) {
//        int nums=123;
//        System.out.println(numberToWords(nums));
//    }
//    static String numberToWords(int num) {
//        String [] lower_d ={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
//        String [] tens_twen ={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
//        String [] upper_d ={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
//        String [] a={"Hundred","Thousand","Million"};
//        String word = new String();
//        if (num<10){
//            return lower_d[num];
//        }
//        else if (num>10 && num<20 ) {
//            return tens_twen[num-10];
//        }
//        else if (num>20 && num<100) {
//            return (upper_d[num/10]+" "+lower_d[num%10]);
//        }
//        else if (Integer.toString(num).length()==3){
//            return (lower_d[num/100] +" "+a[0]+" "+upper_d[num/10]+" "+lower_d[num%10] );
//        }
//        else if (Integer.toString(num).length()==4) {
//            return (upper_d[num/1000]+" "+lower_d[num/100] +" "+a[0]+" "+upper_d[num/10]+" "+lower_d[num%10] );
//        }
//        else if (Integer.toString(num).length()==5) {
//            if (num/1000>10 && num/1000<20){
//                return (tens_twen[num/1000 -10]+" "+a[1]+" "+lower_d[num/100]+" "+a[0]+" "+upper_d[num/10]+" "+lower_d[num%10]);
//            }
//            return (upper_d[num/1000]+" "+lower_d[num/100] +" "+a[0]+" "+upper_d[num/10]+" "+lower_d[num%10] );
//        }
//        else if (Integer.toString(num).length()==6){
//            return ("Ayush");
//        }
//        else{
//            return ("Ayush");
//        }
//    }
//}

public class leetcode273 {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num).trim();
    }

    private static String helper(int num) {
        if (num == 0) return "";
        if (num < 10) return units[num];
        if (num < 20) return teens[num - 10];
        if (num < 100) return tens[num / 10] + " " + helper(num % 10);
        if (num < 1000) return helper(num / 100) + " Hundred " + helper(num % 100);
        if (num < 1000000) return helper(num / 1000) + " Thousand " + helper(num % 1000);
        if (num < 1000000000) return helper(num / 1000000) + " Million " + helper(num % 1_000_000);
        return helper(num / 1000000000) + " Billion " + helper(num % 1_000_000_000);
    }

    public static void main(String[] args) {
        int nums = 123;
        System.out.println(numberToWords(nums));
        // Test other numbers
        System.out.println(numberToWords(12345));
        System.out.println(numberToWords(1234567));
    }
}