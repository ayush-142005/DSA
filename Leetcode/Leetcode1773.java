package Leetcode;

import java.util.List;

public class Leetcode1773 {
     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indx ;
        int res = 0;
        if (ruleKey == "type"){
            indx = 0;
        }
        else if (ruleKey == "color"){
            indx = 1;
        }else{
            indx = 2;
        }
        for (int i = 0; i < items.size(); i++) {
                if (items.get(indx).equals(ruleValue)){
                    res ++;
                }
        }
        return res;
    }
}
