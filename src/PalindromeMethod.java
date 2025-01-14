public class PalindromeMethod {
    public static void main(String[] args) {
        int num = 101;
        System.out.println(isPalindrome(num)==num);
    }
    public static int isPalindrome(int num){
        int palin = 0;
        while(num != 0){
            int qus = num%10;
            palin = palin * 10 + qus;
            num/=10;
        }
        return palin;
    }
}
