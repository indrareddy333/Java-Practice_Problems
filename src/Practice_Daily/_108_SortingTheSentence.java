package Practice_Daily;

import java.util.Arrays;

public class _108_SortingTheSentence {
    //Input: s = "Myself2 Me1 I4 and3"
    //Output: "Me Myself and I"
    //Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
    public static void main(String[] args) {
        String input = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(input));
    }
    public static String sortSentence(String s) {
        String Out = "";
        char ch = '1';
        String[] array = s.split(" ");
        //Out += array[1].substring(0,array[1].length()-1);
        int i = 1;
        while(ch <= '9'){
            if(array[i].contains(ch+"") && i < array.length-1){
                Out = Out + array[i].substring(0,array[i].length()-1)+" ";
            }
            if(i == array.length-1){
                break;
            }
            ch++;
            i++;
        }
        return Out;
    }
}
