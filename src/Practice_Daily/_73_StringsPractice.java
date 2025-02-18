package Practice_Daily;

import java.util.Arrays;

public class _73_StringsPractice {
    public static void main(String[] args)
    {
        boolean bool = Strings("prep", "ppre");
        System.out.println(bool);
    }
    static boolean Strings(String str1, String str2){
        String str3 = str1.replaceAll(" ", "");
        String str4 = str2.replaceAll(" ", "");
        boolean status;
        if(str3.length()!=str4.length()){
            status = false;
        }
        else{
            char[] a1 = str3.toCharArray();
            char[] a2 = str4.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            status = Arrays.equals(a1,a2);
        }
        return status;
    }
    public static void Stringman() {
        String name = "prepre";
        char[] ch = name.toCharArray();
        boolean flag = true;

        for (char chars : ch) {
            if (name.indexOf(chars) == name.lastIndexOf(chars)) {
                System.out.println("character - " + chars);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("no non reapeting charcter");
        }
    }
    //Capitalize the first and last character of each word of a string
    public static void Capitalize(String str){
        String newstr = "";
        String[] strings = str.split(" ");
        for(String str1 : strings){
            String firstchar = str1.substring(0,1);
            String restchar = str1.substring(1, str1.length() - 1);
            String lastchar = "" + str1.charAt(str1.length() - 1);
            newstr = newstr + firstchar.toUpperCase() + restchar + lastchar.toUpperCase() + " ";
        }
        System.out.println(newstr);
    }
    //Calculate frequency of characters in a
    //prepinsta
    public static void Frequnacy(String str){
        int[] frq = new int[str.length()];
        char[] ch = str.toCharArray();
        int visted = -1;
        for(int i = 0; i<str.length(); i++){
            int count = 1;
            for (int j = i+1; j < str.length(); j++) {
                if(ch[i] == ch[j]){
                    count++;
                    frq[j] = visted;
                }
            }
            if(frq[i]!=visted){
                frq[i] = count;
            }
        }
        for (int x = 0; x < frq.length; x++) {
            if(frq[x] != visted){
                System.out.print(ch[x] + "-" + frq[x]);
                System.out.println();
            }
        }


    }
}
