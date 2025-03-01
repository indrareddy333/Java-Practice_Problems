package Practice_Daily;

public class _91_Anagram {
    public static void main(String[] args) {
        //Input: s1 = “geeks”  s2 = “kseeg”
        //Output: true
        String name = "geeks";
        String name2 = "kseeeg";
        boolean check = false;
        if(name.length() == name2.length()){
            for (int i = 0; i < name.length(); i++) {
                for (int j = 0; j < name2.length()-1; j++) {
                    if(name.charAt(i) == name2.charAt(j)){
                        check = true;
                        name2.charAt(i);
                    }
                }
            }
        }else{
            check = false;
        }
        System.out.println(check);
    }
}
