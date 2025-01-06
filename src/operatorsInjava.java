import com.sun.security.jgss.GSSUtil;

public class operatorsInjava {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 300;
        while(++i < --j);
        System.out.println(i);
    }
}
