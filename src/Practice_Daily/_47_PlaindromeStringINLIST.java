package Practice_Daily;

import java.util.ArrayList;
import java.util.List;

public class _47_PlaindromeStringINLIST {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("madam");
        list.add("indra");
        list.add("madam");
        for(int i = 0; i<list.toArray().length; i++){
            boolean bool = true;
            String str = list.get(i);
            int start = 0;
            int end = str.length()-1;
            while(start<=end){
                if(str.charAt(start)!=str.charAt(end)){
                    bool = false;
                    break;
                }
                start++;
                end--;
            }
            if(!bool){
                System.out.println("not plaindrome");
            }
            else{
                System.out.println("plaindrome");
            }
        }
    }
}
