package String;

import java.util.ArrayList;
import java.util.Arrays;

public class String_c {
    public static void main(String[] args) {
//        String name = "Ayush Hood";
//        System.out.println(name);
//        name="Hood"; // Created a new obj  rather than
//        System.out.println(name);


//        // compare
//        String a = "Ayush";
//        String b = "Ayush";
//        // ==5
//        System.out.println(a==b);
//        String a1 = new String("Ayush");
//        String a2 = new String("Ayush");
//        System.out.println(a1==a2);
//        System.out.println(a1.equals(a2));
//        System.out.println(a1.charAt(1));

        System.out.println(Arrays.toString(new int[]{1,2,2}));

            float a = 453.134f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.println();
        System.out.printf("Pie : %.3f",Math.PI);
        System.out.println();
        System.out.printf("I am %s from %s","Ayush","Nagpur");
        System.out.println();
        System.out.println((char)('a'+3)); // asci value + 3
        System.out.println("a"+3); // integer will be converted into string (Wrapper class) or its czll tostring method
        System.out.println("Ayush" + new ArrayList<>());
        String s = (23.0) + " " + new ArrayList<>();
        System.out.println(s);

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
