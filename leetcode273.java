public class leetcode273 {
    public static void main(String[] args) {

    }
    static void numberToWords(int num) {
        String [] lower_d ={"one","two","three","four","five","six","seven","eight","nine"};
        String [] upper_d ={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
        String [] a={"Hundred","Thousand","Million"};
        String word = new String();
        if (Integer.toString(num).length()==3){
            System.out.println(lower_d[num/100] +""+a[0]+""+upper_d[num/10]+""+lower_d[num%10] );
        } else if (Integer.toString(num).length()==4) {
            System.out.println(upper_d[num/1000]+""+lower_d[num/100] +""+a[0]+""+upper_d[num/10]+""+lower_d[num%10] );
        } else if (Integer.toString(num).length()==5) {
            System.out.println(upper_d[num/1000]+""+lower_d[num/100] +""+a[0]+""+upper_d[num/10]+""+lower_d[num%10] );
        }
    }
}
