public class Plaindrome {
    public static void main(String[] args) {
        String word = "madam";
        String plaindrome = "";
        for (int i = word.length()-1;i >= 0; i--){
            plaindrome += word.charAt(i);
        }
        if(word.equals(plaindrome)){
            System.out.println("Entered string is Plaindrome");
        }
        else{
            System.out.println("Not a Palindrome String");
        }


    }
}
