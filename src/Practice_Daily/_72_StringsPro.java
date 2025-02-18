package Practice_Daily;

import java.util.Arrays;

public class _72_StringsPro {
    static void Consonents(char ch){
        if(ch == 'a' || ch == 'e'||ch == 'i'|| ch == 'o'|| ch == 'u'){
            //System.out.println(ch + " is a vowel");
        }else{
           // System.out.println(ch + " is a consonent");
        }
        System.out.println((int)ch);
    }
    //Length of the string without using strlen() function
    static void strlen(String str){
        int count = 0;
        int i = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
    }
    //IndraSena
    static void toggle(String str){
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase((str.charAt(i)))){
                 str1 = str1 + Character.toLowerCase(str.charAt(i));
            }else{
                str1 = str1 + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(str1);
    }
    static void CountVowels(String str){
        int count = 0;
        String str1 = str.toLowerCase();
        for(char ch : str1.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u'){
                count++;
            }
        }
        //System.out.println(count);
    }
    static void removeVowels(String str){
        //remove vowels
        String str1 = str.replaceAll("[aeiou]", "");
        System.out.println(str1);
    }
    static void Plaindrome(String str){
        int start = 0;
        int end = str.length()-1;
        boolean bool = true;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                bool = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(bool);
    }
    static void ReverseOrder(String str){
        String str1 = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);
        System.out.println(str.substring(0,4) + str.substring(2,4));
    }
    public static void main(String[] args) {
        String str = "@P*(&*rep&%^%ins*&%&^%taIn*(&*^d&*^*&%r*&%&^%$a";
        RemovespecialCharcters(str);
    }

    static void RemovespecialCharcters(String name){
        String str = "";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) >= 'a' && name.charAt(i) <=  'z'){
                str = str + name.charAt(i);
            }
        }
        System.out.println(str);
        String name3 = "   Indra Reddy";
        //String name4 = name3.replaceAll(" ", "");
        //System.out.println(name4);
        String bracket = "{2+4}+(hello)";
        String number = bracket.replaceAll("[(){}]", "");
        //System.out.println(number);
        //Input string :- “4PREP2INSTAA6”
        //Output :- 12

        String Input = "4PREP2INSTAA6";
        int sum = 0;
        for(char ch : Input.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                sum = sum + ((int)ch - (int)'0');
            }
        }
        System.out.println(sum);
    }

}
