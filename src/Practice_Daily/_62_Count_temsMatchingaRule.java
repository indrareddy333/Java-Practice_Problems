package Practice_Daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _62_Count_temsMatchingaRule {
    //Example 1:
    //
    //Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
    //Output: 1
    //Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
    //Example 2:
    //
    //Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
    //Output: 2
    //Explanation: There are only two items matching the given rule,
    // which are ["phone","blue","pixel"] and ["phone","gold","iphone"].
    // Note that the item ["computer","silver","phone"] does not match.
    public static void main(String[] args) {
        List< List<String>> list = Arrays.asList(Arrays.asList("phone","blue","pixel"),Arrays.asList("computer","silver","phone"),Arrays.asList("phone","gold","iphone"));
        String rulekey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(list,rulekey,ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if(ruleKey.equals("type")){
            for (int i = 0; i < items.size(); i++) {
                if(ruleValue.equals(items.get(i).get(0))){
                    count = count+1;
                }
            }
        }else if(ruleKey.equals("color")){
            for (int i = 0; i < items.size(); i++) {
                if(ruleValue.equals(items.get(i).get(1))){
                    count = count+1;
                }
            }
        }else{
            for (int i = 0; i < items.size(); i++) {
                if(ruleValue.equals(items.get(i).get(2))){
                    count = count+1;
                }
            }
        }
       return count;
    }

}
