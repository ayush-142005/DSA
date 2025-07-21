package Pattern_printing;

import java.util.HashMap;
import java.util.Map;

public class commandline {
    public static void fun(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        fun("Hello", "world", "Java");
        fun(); // also works with zero arguments
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Ayush");
        map.put("age", 23);
        map.put("city", "NAgpur");
        fun(map);
    }
    public static void fun(Map<String, Object> kwargs) {
        for (Map.Entry<String, Object> entry : kwargs.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
    
}
