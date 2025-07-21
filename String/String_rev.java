package String;

public class String_rev {
    public static void main(String[] args) {
        String name ="Ayush";
        System.out.println(reverse(name));

    }
    static String reverse(String name){
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1-i || i> arr.length-1-i){
                break;
            }
            char temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        return new String(arr);
    }
}
