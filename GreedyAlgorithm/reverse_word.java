package GreedyAlgorithm;

public class reverse_word {
    static String reversewords(String str){
        StringBuilder word = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        if (str==null || str.isEmpty()){
            return str;
        }
        char [] ch = str.toCharArray();
        if (ch[ch.length-1]=='.'){
            for (int i = ch.length-2; i >=0; i--) {
                if (str.charAt(i)=='.'){
                    temp.reverse();
                    word.append(temp.toString());
                    word.append(".");
                    temp.setLength(0);
                }
                else{
                    temp.append(ch[i]);
                }
            }
        }
        for (int i = ch.length-1; i >=0; i--) {
            if (str.charAt(i)=='.'){
                temp.reverse();
                word.append(temp.toString());
                word.append(".");
                temp.setLength(0);
            }
            else{
                temp.append(ch[i]);
            }
        }
        temp.reverse();
        word.append(temp.toString());
        return word.toString();
    }

    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println(reversewords(str));
    }
}
