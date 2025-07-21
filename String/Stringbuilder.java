package String;

import java.util.Arrays;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        for (int ch = 0; ch < 26; ch++) {
            b.append((char)('a'+ch));
        }
        System.out.println(b);

        String name = "Ayush Hood world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('A'));
        System.out.println("            Ayush         ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
