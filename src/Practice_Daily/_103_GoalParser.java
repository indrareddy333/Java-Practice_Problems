package Practice_Daily;

import com.sun.security.jgss.GSSUtil;

public class _103_GoalParser {
    public static void main(String[] args) {
       //Input: command = "G()(al)"
        //Output: "Goal"
        //Explanation: The Goal Parser interprets the command as follows:
        //G -> G
        //() -> o
        //(al) -> al
        //The final concatenated result is "Goal".
        String command = "G()(al)";
        System.out.println(interpret(command));

    }
    public static String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
