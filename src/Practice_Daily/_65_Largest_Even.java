package Practice_Daily;

import java.math.BigInteger;
import java.util.Scanner;

public class _65_Largest_Even {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = scn.next();
        while (!num.isEmpty()) {
            char lastDigit = num.charAt(num.length() - 1);
            if ((lastDigit - '0') % 2 == 0) {
                System.out.println(num);
                break;
            } else {
                num = num.substring(0, num.length() - 1);
            }
        }
        scn.close();
    }

}
