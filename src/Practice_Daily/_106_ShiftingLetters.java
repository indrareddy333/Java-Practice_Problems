package Practice_Daily;

import java.util.Arrays;

public class _106_ShiftingLetters {
    //Input: s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]];
    //Output: "ace";
    public static void main(String[] args) {
        String s = "dztz";
        int[][] shifts = {{0,0,0},{1,1,1}};
        System.out.println(shiftingLetters(s,shifts));
    }
    public static String shiftingLetters(String s, int[][] shifts) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < shifts.length; i++) {
            if (shifts[i][2] == 0) {
                for (int k = shifts[i][0]; k <= shifts[i][1]; k++) {
                    if (ch[k] > 'a') {
                        ch[k] -= 1;
                    } else {
                        ch[k] = 'z';
                    }
                }
            } else {
                for (int k = shifts[i][0]; k <= shifts[i][1]; k++) {
                    if (ch[k] < 'z') {
                        ch[k] += 1;
                    } else {
                        ch[k] = 'a';
                    }
                }
            }
        }
        s = new String(ch);
        return s;
    }
}
