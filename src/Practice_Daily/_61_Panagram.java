package Practice_Daily;
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//Example 2:
//Input: sentence = "leetcode"
//Output: false
public class _61_Panagram {
    public static void main(String[] args) {
        String sentence = "hequickbrownfoxjumpsoverhelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
            System.out.println(sentence.indexOf(ch));
        }
        return true;
    }
}
