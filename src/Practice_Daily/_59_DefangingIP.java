package Practice_Daily;
//https://leetcode.com/problems/defanging-an-ip-address/solutions/6414257/best-solution/
public class _59_DefangingIP {
    public static void main(String[] args) {
        //Input: address = "1.1.1.1"
        //Output: "1[.]1[.]1[.]1"
        String input = "1.1.1.1";
        String Output = input.replace(".", "[.]");
    }
}
