package Practice_Daily;

public class _09_CountItemMatchingRule {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(CountRule(items,ruleKey,ruleValue));
    }
    public static int CountRule(String[][] Items, String ruleKey, String ruleValue){
        int count = 0;
        for(int i = 0; i < Items.length; i++){
            if("type".equals(ruleKey)){
                if(Items[i][0].equals(ruleValue)){
                    count++;
                }
            }
            else if("color".equals(ruleKey)){
                if(Items[i][1].equals(ruleValue)){
                    count++;
                }
            }
            else if("name".equals(ruleKey)){
                if(Items[i][2].equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }

}

