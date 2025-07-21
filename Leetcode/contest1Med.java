package Leetcode;

public class contest1Med {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
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
        return res.toString();
    }
}
