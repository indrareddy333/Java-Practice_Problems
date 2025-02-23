package Practice_Daily;

public class _80_Strings {
    public static void main(String[] args) {
        String name = "Hello, Great to see you";

        String[] strs = name.split(" ");
        for(String str : strs){
            System.out.println(str);
        }
    }
}
