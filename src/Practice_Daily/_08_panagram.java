package Practice_Daily;

public class _08_panagram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfxjumpsoverthelazdg";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            System.out.println(sentence.indexOf(121));
            if(sentence.indexOf(ch)<0){
                return false;
            }
        }
        return true;
    }
}
