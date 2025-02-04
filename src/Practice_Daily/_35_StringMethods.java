package Practice_Daily;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class _35_StringMethods {
    public static void main(String[] args) {
        String name = "Indra Reddy";
        //System.out.println(Arrays.toString(name.toCharArray()));
        //System.out.println(name.toUpperCase());
        //System.out.println(name.indexOf('a'));
        //System.out.println(name.trim().toUpperCase());
        //System.out.println(name.trim().charAt(0));
        //System.out.println((char)name.codePointAt(1));
        //System.out.println(name.compareTo("Indra Red"));
        System.out.println(name.isBlank());

    }
}
