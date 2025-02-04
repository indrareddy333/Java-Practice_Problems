package Practice_Daily;

public class _36_ISpalindrome {
    public static void main(String[] args) {
        String name = "a";
        boolean bool = true;
        int start = 0;
        int end = name.length()-1;
        while(start<=end){
            if(name.trim().charAt(start)!=name.trim().charAt(end)){
                bool = false;
                break;
            }
            start = start+1;
            end = end-1;
        }
        System.out.println(bool);
    }
}
