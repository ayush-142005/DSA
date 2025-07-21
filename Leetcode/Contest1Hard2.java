package Leetcode;

public class Contest1Hard2 {
    public String processStr(String s, long k) {
        StringBuilder res = new StringBuilder();
        StringBuilder res1=new StringBuilder();
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='z'){
                res.append(ch[i]);
            } else if (ch[i]=='*') {
                if(res.length()>0){
                    res.deleteCharAt(res.length()-1);
                }
            } else if (ch[i]=='#') {
                res.append(res.toString());
            } else if (ch[i]=='%') {
                res.reverse();
            }
        }
        char ch1 [] = (res.toString()).toCharArray();
        for (long i = k; i < ch1.length; i++) {
            res1.append(ch1[(int) i]);
        }
        return res1.toString();
    }
}
