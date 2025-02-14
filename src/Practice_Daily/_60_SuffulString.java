package Practice_Daily;
//https://leetcode.com/problems/shuffle-string/description/
public class _60_SuffulString {
    //Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
    //Output: "leetcode"
    //Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

    //Input: s = "abc", indices = [0,1,2]
    //Output: "abc"
    //Explanation: After shuffling, each character remains in its position.

    //"aiohn"
    //3,1,4,2,0
    //nihao
    public static void main(String[] args) {
        String s = "codeleet";
        int[] array = {4,5,6,7,0,2,1,3};
        System.out.println(Shuffle(s, array));
    }
    static String Shuffle(String s, int[] array){
       char[] ch = new char[s.length()];
       for(int i = 0; i<ch.length;i++){
           ch[array[i]] = s.charAt(i);
       }
        String str = new String(ch);
       return str;
    }

}
